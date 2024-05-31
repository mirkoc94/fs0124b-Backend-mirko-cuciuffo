package it.epicode.gestione.eventi.businesslayer.services.impl;

import it.epicode.gestione.eventi.businesslayer.services.Mapper;
import it.epicode.gestione.eventi.businesslayer.services.UserService;
import it.epicode.gestione.eventi.businesslayer.services.dto.LoginResponseDto;
import it.epicode.gestione.eventi.businesslayer.services.dto.RegisterUserDto;
import it.epicode.gestione.eventi.businesslayer.services.dto.RegisteredUserDto;
import it.epicode.gestione.eventi.businesslayer.services.exceptions.InvalidLoginException;
import it.epicode.gestione.eventi.businesslayer.services.exceptions.PersistEntityException;
import it.epicode.gestione.eventi.config.JwtUtils;
import it.epicode.gestione.eventi.datalayer.entities.RoleEntity;
import it.epicode.gestione.eventi.datalayer.entities.UserEntity;
import it.epicode.gestione.eventi.datalayer.repositories.RoleRepository;
import it.epicode.gestione.eventi.datalayer.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Stream;

@Service
@Slf4j
public class UserServiceImpl extends UserService {

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    UserRepository users;
    @Autowired
    private RoleRepository roles;

    @Autowired
    private AuthenticationManager auth;

    @Autowired
    private JwtUtils jwt;

    @Autowired
    Mapper<RegisterUserDto, UserEntity> mapEntity;
    @Autowired
    Mapper<UserEntity, RegisteredUserDto> mapRegisteredUser;
    @Autowired
    Mapper<UserEntity, LoginResponseDto> mapLogin;

    @Override
    public RegisteredUserDto register(RegisterUserDto user) {
        try {
            var u = mapEntity.map(user);
            var p = encoder.encode(user.getPassword());
            log.info("Password encrypted: {}", p);
            u.setPassword(p);
            if (user.getRoles() != null)
                Stream.of(user.getRoles().split(",")).forEach(r -> u.getRoles().add(roles.findOneByName(r) //
                        .orElse(roles.save(RoleEntity.builder().withName(r).build()))));
            return mapRegisteredUser.map(users.save(u));
        } catch (Exception e) {
            log.error(String.format("Exception saving user %s", user), e);
            throw new PersistEntityException(user);
        }
    }

    @Override
    public Optional<LoginResponseDto> login(String username, String password) {
        try {
            var a = auth.authenticate(new UsernamePasswordAuthenticationToken(username, password));
            a.getAuthorities();
            SecurityContextHolder.getContext().setAuthentication(a);

            var dto = mapLogin.map(users.findOneByUsername(username).orElseThrow());
            dto.setToken(jwt.generateToken(a));
            return Optional.of(dto);
        } catch (NoSuchElementException e) {
            log.error("User not found", e);
            throw new InvalidLoginException(username, password);
        } catch (AuthenticationException e) {
            log.error("Authentication failed", e);
            throw new InvalidLoginException(username, password);
        }
    }

    @Override
    public Optional<RegisteredUserDto> get(long id) {
        try {
            return Optional.of(mapRegisteredUser.map(users.findById(id).orElseThrow()));
        } catch (Exception e) {
            log.error(String.format("User not found for id %s", id), e);
            return Optional.empty();
        }
    }
}
