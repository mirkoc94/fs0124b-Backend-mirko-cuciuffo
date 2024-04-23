package it.epicode.esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //chiede all'utente di scrivere quante parole vuole inserire
        System.out.print("scrivere quante parole si vogliono inserire, e premere invio: ");
        int N = scanner.nextInt();

        Set<String> setParole = new HashSet<String>();

        //aggiunge al set la parola scritta dall'utente
        for (int i = 0; i < N; i++) {
            System.out.print("inserisci parola n." + (i+1) + ", e premi invio: ");
            String parola = scanner.nextLine();
            //se la parola aggiunta é uguale ad una giá presente, il metodo add() vá in false e scatena il messaggio
            if (!setParole.add(parola)) {
                System.out.println("la parola '" + parola + "' é doppia");
            }
        }

        System.out.println("le parole distinte sono: ");
        for (String parola : setParole) {
            System.out.println(parola);
        }

        System.out.println("il numero di parole distinte sono: " + setParole.size());

        scanner.close();
    }
}
