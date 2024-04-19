package it.epicode.esercizio2;

public class Sim {
    private String numero;
    private int credito;
    private Chiamata[] Chiamate;

    public Sim(String numero) {
        this.numero = numero;
        this.credito = 0;
        this.Chiamate = new Chiamata[5];
    }

    public void stampaDati() {
        System.out.println("numero: " + this.numero);
        System.out.println("credito: " + this.credito);
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public int getCredito() {
        return credito;
    }
    public void setCredito(int credito) {
        this.credito = credito;
    }
    public Chiamata[] getChiamate() {
        for (int i = 0; i < 5; i++) {
            return
        }
    }
}
