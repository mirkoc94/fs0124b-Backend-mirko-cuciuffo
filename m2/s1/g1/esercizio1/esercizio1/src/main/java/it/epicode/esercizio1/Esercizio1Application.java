package it.epicode.esercizio1;

import it.epicode.esercizio1.entities.Menu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication

@Slf4j
public class Esercizio1Application {

	public static void main(String[] args) {
		SpringApplication.run(Esercizio1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Esercizio1Application.class);

		Menu m = (Menu) ctx.getBean("menu");

		m.printMenu();
		ctx.close();
	}

}
