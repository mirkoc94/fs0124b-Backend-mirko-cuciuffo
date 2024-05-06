package it.epicode;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.slf4j.LoggerFactory;

public class Main {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(Main.class);
    private static final String PERSISTENCE_UNIT = "JPA_Inheritance";

    public static void main (String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        EntityManager em = emf.createEntityManager();

        try {
            //nuova instanza

            //log.debug("messaggio di quell che sto per fare")
            EntityTransaction trans = em.getTransaction();
            trans.begin();

            //log.debug("messaggio di quell che sto per fare")
            //em.persist(istanza);

            //log.debug("messaggio di quell che sto per fare")
            trans.commit();
        }
        catch (Exception e) {
            log.error("eccezione durante le operazioni", e);
        }
        finally {
            em.close();
            emf.close();
        }
    }
}
