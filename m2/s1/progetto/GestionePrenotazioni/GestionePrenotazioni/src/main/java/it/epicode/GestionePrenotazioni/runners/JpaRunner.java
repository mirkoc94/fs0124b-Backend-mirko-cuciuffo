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
        var u1 = users.save(User.builder().withUsername("mirko")
                .withFirstName("mirko")
                .withLastName("rossi")
                .withEmail("mirkorossi@gmail.it")
                .build());
        var u2 = users.save(User.builder().withUsername("ale")
                .withFirstName("alex")
                .withLastName("bianchi")
                .withEmail("alebianchi@gmail.it")
                .build());

        //creazione buildings
        var b1 = buildings.save(Building.builder()
                .withName("edificioA")
                .withAddress("via Torino 1")
                .withCity("ragusa")
                .build());
        var b2 = buildings.save(Building.builder()
                .withName("edificioB")
                .withAddress("viale Europa 2")
                .withCity("modica")
                .build());

        //creazione workstations
        var ws1 = workstations.save(Workstation.builder()
                .withTypeWS(TypeWS.PRIVATE)
                .withDescription("auletta dotata di proiettore")
                .withBuilding(b1)
                .withMaxUsers(50)
                .build());
        var ws2 = workstations.save(Workstation.builder()
                .withTypeWS(TypeWS.OPENSPACE)
                .withDescription("annesso centro ristoro, situato al terzo piano dell'edificio")
                .withBuilding(b2)
                .withMaxUsers(80)
                .build());
        var ws3 = workstations.save(Workstation.builder()
                .withTypeWS(TypeWS.MEETING_ROOM)
                .withDescription("al piano terra dell'edificio, dotato di proiettori e microfoni")
                .withBuilding(b2)
                .withMaxUsers(120)
                .build());
    }
}
