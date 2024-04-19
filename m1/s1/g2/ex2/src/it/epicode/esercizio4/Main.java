package it.epicode.esercizio4;

public class Main {

    public static void countdown(int number) {
        for (int i = number ; i > -1 ; i--) {
            System.out.println(i);
        }
        System.out.println("Stop!");
    }

    public static void main(String[] args) {
        countdown(10);
    }

}
