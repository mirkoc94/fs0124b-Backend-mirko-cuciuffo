package it.epicode.code.classes;

import it.epicode.code.interfaces.Luminosita;

public class Immagine extends Media implements Luminosita {

    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void show() {
        System.out.print("Titolo: " + getTitolo() + "Luminositá: " + getLuminosita());

        for (int i = 0; i < luminosita; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //luminositá

    @Override
    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }

    @Override
    public void aumentaLuminosita() {
        if (luminosita < 10) {
            luminosita++;
        }
    }

}