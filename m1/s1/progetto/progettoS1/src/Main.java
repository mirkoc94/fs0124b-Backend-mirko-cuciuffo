import it.epicode.code.classes.Audio;
import it.epicode.code.classes.Immagine;
import it.epicode.code.classes.Video;
import it.epicode.code.interfaces.Luminosita;
import it.epicode.code.interfaces.Riproducibili;

public class Main {

    public static void main (String[] args) {

        Immagine i1 = new Immagine("fiore ", 5);
        Immagine i2 = new Immagine("sole ", 10);
        Audio a1 = new Audio("Numb ", 9, 5);
        Audio a2 = new Audio("Castle of glass ", 8, 6);
        Video v1 = new Video("In the end ", 10, 7, 4);


        //immagini
        i1.show();
        i1.getLuminosita();
        i2.show();
        i2.diminuisciLuminosita();

        //audio
        a1.play();
        a1.alzaVolume();
        a2.play();
        a2.alzaVolume();

        //video
        v1.play();
        v1.abbassaVolume();
        v1.aumentaLuminosita();

    }

}
