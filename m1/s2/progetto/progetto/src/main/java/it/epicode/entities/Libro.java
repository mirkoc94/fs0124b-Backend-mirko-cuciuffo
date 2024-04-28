package it.epicode.entities;

public class Libro extends Catalogo {
    private String autore;
    private String genere;

    public Libro(String isbn, String titolo, int anno, int pagine, String autore, String genere) {
        super(isbn, titolo, anno, pagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String toString() {
        return super.toString() + "Libro [autore: " + autore + ", genere: " + genere + "]";
    }

    public String getAutore() {
        return autore;
    }

    public String getGenere() {
        return genere;
    }
}
