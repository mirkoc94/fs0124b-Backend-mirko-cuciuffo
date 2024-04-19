package it.epicode.code.classes;

import it.epicode.code.interfaces.Riproducibili;

public class Audio extends Media implements Riproducibili {

    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }



    //player

    //stampo tante righe di titolo+volume in base
    //al valore di durata, andando ogni volta a capo
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.print("Titolo:" + getTitolo() + "Volume: " + getVolume());

            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
        System.out.println();
        }
    }

    //volume

    //abbasso il volume e stampo tanti "!"
    //in base al valore corrente di volume
    @Override
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    //alzo il volume e stampo tanti "!"
    //in base al valore corrente di volume
    @Override
    public void alzaVolume() {
        if (volume < 10) {
            volume++;
        }
    }
}