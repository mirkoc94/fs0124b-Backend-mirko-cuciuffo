package it.epicode.esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main (String[] args) {

        int N = 10;
        List<Integer> listNumeri = generaRandom(N);

        System.out.println(N + " interi casuali:");
        for (Integer n : listNumeri) {
            System.out.println(n);
        }

        List<Integer> listaInvertita = invertiLista(listNumeri);
        System.out.println("lista invertita:" + listaInvertita);

        stampaPosizioni(listNumeri, true);
        stampaPosizioni(listNumeri, false);

    }

    public static List<Integer> generaRandom(int N) {
        List<Integer> lista = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            lista.add(random.nextInt(101));
        }

        Collections.sort(lista);

        return lista;
    }

    public static List<Integer> invertiLista(List<Integer> lista) {
        List<Integer> listaInvertita = new ArrayList<Integer>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            listaInvertita.add(lista.get(i));
        }
        return listaInvertita;
    }

    public static void stampaPosizioni(List<Integer> lista, boolean pari) {
        System.out.println("valori nelle posizioni ");
        if (pari) {
            System.out.println("pari: ");
            for (int i = 0; i < lista.size(); i += 2) {
                System.out.println(lista.get(i));
            }
        } else {
            System.out.println("dispari: ");
            for (int i = 1; i < lista.size(); i += 2) {
                System.out.println(lista.get(i));
            }
        }
    }

}
