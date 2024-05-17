package it.epicode.GestionePrenotazioni.repositories;

import it.epicode.GestionePrenotazioni.entities.Building;
import it.epicode.GestionePrenotazioni.entities.TypeWS;
import it.epicode.GestionePrenotazioni.entities.Workstation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkstationRepository extends JpaRepository<Workstation, Integer> {

    List<Workstation> findByBuildingNameIgnoreCase(String name);
}
