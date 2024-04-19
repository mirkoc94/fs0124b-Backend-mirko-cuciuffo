package it.epicode.esercizio1;

public class Rettangolo {
    int base;
    int altezza;

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }


    public int perimeter() { return(base+altezza)*2; }
    public int area() { return base * altezza; }

}
