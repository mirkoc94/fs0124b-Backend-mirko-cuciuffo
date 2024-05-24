package it.epicode.esercizio1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String [] args) {

        //creazione array di interi
        int[] arr = new int[5];

        //instanza di un oggetto random
        Random random = new Random();

        //riempimento dell'array con numeri casuali
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11);
        }
        System.out.println("numeri casuali dall'array:");
        for (int value : arr) {
            System.out.println(value);
        }

        //creazione di un oggetto per l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        //richiesta all'utente di inserire numero e posizione
        System.out.println("inserisci numero (tra 1 e 10):");
        int numeroInserito = scanner.nextInt();

        System.out.println("inserisci posizione (da 1 a 5):");
        int posizione = scanner.nextInt();

        //if (numeroInserito == null) {

        //}

    }

}
