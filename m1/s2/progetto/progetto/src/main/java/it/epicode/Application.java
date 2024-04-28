package it.epicode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Application {
    static final Path file = Path.of("C:/Users/mirko/Desktop/fs0124b-Backend/m1/s2/progetto/progetto/src/main/java/it", //
            "catalogo.csv");

    public static void main (String[] args) throws IOException {
        Files.lines(file).skip(1).forEach(System.out::println);
    }

}
