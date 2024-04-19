package it.epicode.esercizio1;

public abstract class Dipendente {
    public abstract int calculateSalary();
    private String matricola;
    private int stipendio;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, int stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public int getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public void stampaDatiDipendente() {
        System.out.println("matricola:" + matricola);
        System.out.println("stipendio:" + stipendio);
        System.out.println("dipartimento:" + dipartimento);
    }


}
