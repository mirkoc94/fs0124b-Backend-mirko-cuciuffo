package it.epicode.entities;

public class Rivista extends Catalogo {
    private Periodicita periodicita;

    public Rivista(String isbn, String titolo, int anno, int pagine, Periodicita periodicita) {
        super(isbn, titolo, anno, pagine);
        this.periodicita = periodicita;
    }

    public String toString() {
        return super.toString() + "Rivista [periodicitá: " + periodicita + "]";
    }
}
