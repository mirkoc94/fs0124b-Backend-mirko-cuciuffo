package it.epicode.gestione.eventi.businesslayer.services;

public interface Mapper<D, S> {
    S map(D input);
}
