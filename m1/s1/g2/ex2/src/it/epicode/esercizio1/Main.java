package it.epicode.esercizio1;

public class Main {

    public static boolean stringaPariDispari (String str) {
        return str.length() % 2 == 0;
    }

    public static boolean annoBisestile (int anno) {
        if (anno%4 == 0) {
            return true;
        } else if (anno%4 != 0) {
            return false;
        }

    }

    public static void main(String[] args) {
        String str = "benvenuti a epicode";
        System.out.println("la stringa é lunga " + str + (stringaPariDispari(str) ? "pari" : "dispari"));

        int anno = 1876;
        System.out.println("l'anno " + anno + (annoBisestile(anno) ? "non" : "") + "é bisestile");
    }
}