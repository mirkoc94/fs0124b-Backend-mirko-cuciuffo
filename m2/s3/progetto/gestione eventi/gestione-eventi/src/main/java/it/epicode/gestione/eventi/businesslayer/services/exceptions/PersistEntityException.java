package it.epicode.gestione.eventi.businesslayer.services.exceptions;

import it.epicode.gestione.eventi.businesslayer.services.dto.DtoBase;

public class PersistEntityException extends ServiceException {
    private static final long serialVersionUID = 1L;

    public final DtoBase invalidDto;

    public PersistEntityException(DtoBase invalidDto) {
        super();
        this.invalidDto = invalidDto;
    }
}
