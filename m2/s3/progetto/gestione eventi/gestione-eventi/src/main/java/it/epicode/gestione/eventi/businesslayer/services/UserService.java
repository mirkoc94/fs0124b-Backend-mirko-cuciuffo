package it.epicode.gestione.eventi.businesslayer.services;

import it.epicode.gestione.eventi.businesslayer.services.dto.LoginResponseDto;
import it.epicode.gestione.eventi.businesslayer.services.dto.RegisterUserDto;
import it.epicode.gestione.eventi.businesslayer.services.dto.RegisteredUserDto;

import java.util.Optional;

public abstract class UserService {

    public abstract RegisteredUserDto register(RegisterUserDto user);

    public abstract Optional<LoginResponseDto> login(String username, String password);

    public abstract Optional<RegisteredUserDto> get(long id);
}
