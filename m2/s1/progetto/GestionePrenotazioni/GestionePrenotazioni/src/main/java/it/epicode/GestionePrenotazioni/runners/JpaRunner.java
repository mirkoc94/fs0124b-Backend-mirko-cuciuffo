package it.epicode.GestionePrenotazioni.runners;

import it.epicode.GestionePrenotazioni.entities.Building;
import it.epicode.GestionePrenotazioni.entities.TypeWS;
import it.epicode.GestionePrenotazioni.entities.User;
import it.epicode.GestionePrenotazioni.entities.Workstation;
import it.epicode.GestionePrenotazioni.repositories.BuildingRepository;
import it.epicode.GestionePrenotazioni.repositories.ReservationRepository;
import it.epicode.GestionePrenotazioni.repositories.UserRepository;
import it.epicode.GestionePrenotazioni.repositories.WorkstationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class JpaRunner implements CommandLineRunner {

    @Autowired
    BuildingRepository buildings;

    @Autowired
    ReservationRepository reservations;

    @Autowired
    UserRepository users;

    @Autowired
    WorkstationRepository workstations;

    @Override
    public void run(String... args) throws Exception {

        //creazione users
        var user1 = users.save(User.builder().withUsername("mirko")
                .withFirstName("mirko")
                .withLastName("rossi")
                .withEmail("mirkorossi@gmail.it")
                .build());
        var user2 = users.save(User.builder().withUsername("ale")
                .withFirstName("alex")
                .withLastName("bianchi")
                .withEmail("alebianchi@gmail.it")
                .build());

        //creazione buildings
        var build1 = buildings.save(Building.builder().withName("edificioA")
                .withAddress("via Torino 1")
                .withCity("ragusa")
                .build());
        var build2 = buildings.save(Building.builder().withName("edificioB")
                .withAddress("viale Europa 2")
                .withCity("modica")
                .build());

        //creazione workstations
        var workstation1 = workstations.save(Workstation.builder().withTypeWS(TypeWS.PRIVATE)
                .withDescription("palazzo barocco, nei pressi della piazza centrale")
                .withBuilding().build());
    }
}
