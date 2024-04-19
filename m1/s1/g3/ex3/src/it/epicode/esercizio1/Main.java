package it.epicode.esercizio1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Stampa rettangolo");
        Rettangolo r1 = new Rettangolo(3,4);
        stampaRettangolo(r1);
        System.out.println("Stampa due rettangoli");
        Rettangolo r2 = new Rettangolo(5,6);
        stampaDueRettangoli(r1, r2);
    }

    public static void stampaRettangolo(Rettangolo a) {
        System.out.println("il perimetro é " + a.perimeter());
        System.out.println("l'area é " + a.area());
    }

    public static void stampaDueRettangoli(Rettangolo b, Rettangolo c) {
        System.out.println("primo rettangolo:");
        stampaRettangolo(b);
        System.out.println("secondo rettangolo:");
        stampaRettangolo(c);

        int sommaPerimetro = b.perimeter() + c.perimeter();
        int sommaArea = b.area() + c.area();

        System.out.println("la somma dei perimetri é ");
        System.out.println(sommaPerimetro);
        System.out.println("la somma delle aree é ");
        System.out.println(sommaArea);

    }
}