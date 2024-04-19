package it.epicode.esercizio1;

public class DipendenteFullTime extends Dipendente {

    public DipendenteFullTime(String matricola, int stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public int calculateSalary() {
        return getStipendio();
    }

}
