package it.epicode.esercizio2;

public class Main {

    public static string converter (int number) {
        switch (number){
            case number=1 :
                System.out.println("uno");
            case number=2 :
                System.out.println("due");
            case number<1 && number>2 :
                System.out.println("errore");
            break;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 9; ++i)
            converter(i);
    }
}
