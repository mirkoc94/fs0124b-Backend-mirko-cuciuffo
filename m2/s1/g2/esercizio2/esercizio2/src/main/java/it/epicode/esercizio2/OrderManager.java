package it.epicode.esercizio2;

import it.epicode.esercizio2.entitiesMenu.Drink;
import it.epicode.esercizio2.entitiesMenu.Item;
import it.epicode.esercizio2.entitiesMenu.Menu;
import it.epicode.esercizio2.entitiesMenu.Pizza;
import it.epicode.esercizio2.entitiesOrder.Order;
import it.epicode.esercizio2.entitiesOrder.Table;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class OrderManager implements CommandLineRunner {

    @Autowired
    @Qualifier("table1")
    Table table1;

    @Autowired
    Menu menu;

    @Autowired
    @Qualifier("pizza_margherita")
    Pizza pizzaMargherita;

    @Autowired
    @Qualifier("wine")
    Drink wine;

    @Value("${order.coverAmount}")
    double coverChange;

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Esercizio2Application.class);

        try {
            Menu m = (Menu) ctx.getBean("menu");
            m.printMenu();

            Table t1 = (Table) ctx.getBean("table1");

            Order o1 = new Order(1);

            o1.addItem(ctx.getBean("pizza_margherita", Pizza.class));
            o1.addItem(ctx.getBean("hawaiian_pizza", Pizza.class));
            o1.addItem(ctx.getBean("salami_pizza_xl", Pizza.class));
            o1.addItem(ctx.getBean("lemonade", Drink.class));
            o1.addItem(ctx.getBean("lemonade", Drink.class));
            o1.addItem(ctx.getBean("wine", Drink.class));

            log.info("DETTAGLI TAVOLO 1:");

            log.info("CONTO TAVOLO 1");
            log.info(o1.getTotal());
        } catch (Exception ex) {
            log.error(ex.getMessage());
        } finally {
            ctx.close();
        }
    }
}
