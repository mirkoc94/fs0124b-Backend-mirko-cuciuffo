package it.epicode.gestione.eventi.config;

import it.epicode.gestione.eventi.businesslayer.services.Mapper;
import it.epicode.gestione.eventi.businesslayer.services.dto.LoginResponseDto;
import it.epicode.gestione.eventi.businesslayer.services.dto.RegisterUserDto;
import it.epicode.gestione.eventi.datalayer.entities.UserEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeansConfiguration {
    @Bean
    @Scope("singleton")
    Mapper<RegisterUserDto, UserEntity> mapRegisterUser2UserEntity() {
        return (input) -> UserEntity.builder() //
                .withPassword(input.getPassword()) //
                .withUsername(input.getUsername()) //
                .build();
    }

    @Bean
    @Scope("singleton")
    Mapper<UserEntity, RegisteredUserDto> mapUserEntity2RegisteredUser() {
        return (input) -> RegisteredUserDto.builder()
                .withId(input.getId())
                .withUsername(input.getUsername())
                .withRoles(input.getRoles().stream().map(r -> r.getName()).toList()) //
                .build();
    }

    @Bean
    @Scope("singleton")
    Mapper<UserEntity, LoginResponseDto> mapUserEntity2LoginResponse() {
        return (input) -> LoginResponseDto.builder()
                .withId(input.getId())
                .withUsername(input.getUsername())
                .withRoles(input.getRoles().stream().map(r -> r.getName()).toList()) //
                .build();
    }
}
