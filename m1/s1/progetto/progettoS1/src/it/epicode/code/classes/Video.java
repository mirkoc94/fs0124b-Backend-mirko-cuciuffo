package it.epicode.code.classes;

import it.epicode.code.interfaces.Luminosita;
import it.epicode.code.interfaces.Riproducibili;

public class Video extends Audio implements Riproducibili, Luminosita {
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata, volume);
        this.luminosita = 5;
    }

    public int getLuminosita() {
        return luminosita;
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
