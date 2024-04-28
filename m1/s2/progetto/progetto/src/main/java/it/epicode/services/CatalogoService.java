package it.epicode.services;

import it.epicode.entities.Catalogo;

public interface CatalogoService {
    void addArticolo(Catalogo catalogo);
    void deleteByIsbn(String isbn);
    void getByIsbn(String isbn);
    void getByAnno(int anno);
    void getByAutore(String autore);

}
