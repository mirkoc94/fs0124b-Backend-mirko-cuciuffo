package it.epicode.esercizio2;

import it.epicode.esercizio2.entitiesMenu.Menu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication

@Slf4j
public class Esercizio2Application {

	public static void main(String[] args) {
		SpringApplication.run(Esercizio2Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Esercizio2Application.class);

		Menu m = (Menu) ctx.getBean("menu");

		m.printMenu();
		ctx.close();
	}

}
