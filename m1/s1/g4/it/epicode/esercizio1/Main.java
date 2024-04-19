package it.epicode.esercizio1;

public class Main {

    public static void effettuaCheckIn (InizioLavoro l) {
        l.checkIn();
    }

    public static void main (String[] args) {
        Dipendente[] listaDipendenti = {
                new DipendenteFullTime("0000", 1000, Dipartimento.PRODUZIONE),
                new DipendenteFullTime("0001", 1000, Dipartimento.PRODUZIONE),
                new DipendentePartTime("0002", 100, 20, Dipartimento.PRODUZIONE)
        };

        for (Dipendente d : listaDipendenti) {
            System.out.println("dipendente " + d.getMatricola());
        }

        for (Dipendente d : listaDipendenti) {
            System.out.println("dipendente " + d.getMatricola() + " - stipendio " + d.getStipendio());
        }

    }
}
