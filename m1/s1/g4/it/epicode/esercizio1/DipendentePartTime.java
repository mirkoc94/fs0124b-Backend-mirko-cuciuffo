package it.epicode.esercizio1;

public class DipendentePartTime extends Dipendente {
    private int oreLavorate;
    private int pagaOraria;

    public DipendentePartTime(String matricola, int oreLavorate, int pagaOraria, Dipartimento dipartimento) {
        super(matricola, oreLavorate*pagaOraria, dipartimento);
        this.oreLavorate = oreLavorate;
        this.pagaOraria = pagaOraria;
    }

    public int getOreLavorate() {
        return oreLavorate;
    }

    public void setOreLavorate(int oreLavorate) {
        this.oreLavorate = oreLavorate;
    }

    public int getPagaOraria() {
        return pagaOraria;
    }

    public void setPagaOraria(int pagaOraria) {
        this.pagaOraria = pagaOraria;
    }

    @Override
    public int calculateSalary() {
        return oreLavorate*pagaOraria;
    }

}
