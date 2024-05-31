package it.epicode.gestione.eventi.businesslayer.services.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class RegisteredUserDto {
    private long id;
    private String username;
    private final List<String> roles;

    @Builder(setterPrefix = "with")
    public RegisteredUserDto(long id, String username, String token, List<String> roles) {
        this.id = id;
        this.username = username;
        this.roles = roles;
    }
}
