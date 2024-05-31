package it.epicode.gestione.eventi.presentationlayer.controllers.api.exceptions;

import jakarta.validation.ValidationException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import java.util.List;

public class FieldValidationException extends ValidationException {
    private static final long serialVersionUID = 1L;

    public final List<FieldError> errors;

    public final List<ObjectError> otherErrors;

    public FieldValidationException(List<ObjectError> errors) {
        this.errors = errors.stream().filter(a -> a instanceof FieldError).map(a -> (FieldError) a).toList();
        this.otherErrors = errors.stream().filter(a -> !(a instanceof FieldError)).toList();
    }
}
