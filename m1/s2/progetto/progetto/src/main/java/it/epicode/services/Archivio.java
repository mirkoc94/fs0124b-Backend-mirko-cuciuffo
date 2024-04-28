package it.epicode.services;

import it.epicode.entities.Catalogo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Archivio implements CatalogoService{
    private static final Logger log = LoggerFactory.getLogger(Archivio.class);
    private final List<Catalogo> articoli = new ArrayList<>();

    private static final String STORAGE = "C:/Users/mirko/Desktop/fs0124b-Backend/m1/s2/progetto/progetto/src/main/java/it/catalogo.csv";

    @Override
    public void addArticolo(Catalogo catalogo) {
        articoli.add(catalogo);
    }

    @Override
    public void deleteByIsbn(String isbn) {

    }

    @Override
    public void getByIsbn(String isbn) {

    }

    @Override
    public void getByAnno(int anno) {
    }

    @Override
    public void getByAutore(String autore) {

    }
}
