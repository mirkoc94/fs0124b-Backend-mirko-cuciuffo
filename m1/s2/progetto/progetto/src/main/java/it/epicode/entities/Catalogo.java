package it.epicode.entities;

public class Catalogo {
    private String isbn;
    private String titolo;
    private int anno;
    private int pagine;

    public Catalogo(String isbn, String titolo, int anno, int pagine) {
        this.isbn = isbn;
        this.titolo = titolo;
        this.anno = anno;
        this.pagine = pagine;
    }

    public String toString() {
        return "Catalogo [ISBN: " + isbn + ", titolo: " + titolo + ", anno: " + anno + ", pagine: " + pagine + "]";
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnno() {
        return anno;
    }

    public int getPagine() {
        return pagine;
    }
}
