package it.epicode.gestione.eventi.presentationlayer.controllers.api.models;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record RegisterUserModel(@NotBlank @Length(max = 125) String username,
                                @NotBlank @Length(max = 15) String password, String roles) {
}
