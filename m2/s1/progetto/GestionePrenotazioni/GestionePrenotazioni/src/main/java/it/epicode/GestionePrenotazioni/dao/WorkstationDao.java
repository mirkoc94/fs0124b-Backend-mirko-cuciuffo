package it.epicode.GestionePrenotazioni.dao;

import it.epicode.GestionePrenotazioni.entities.Building;
import it.epicode.GestionePrenotazioni.entities.TypeWS;
import it.epicode.GestionePrenotazioni.entities.Workstation;

import java.util.List;

public interface WorkstationDao {
    public void insert(Workstation workstation); // Create

    public void update(Workstation workstation); // Update

    public void delete(Integer id); // Delete

    public Workstation getById(Integer id); // Read

    public List<Workstation> getByBuildingNameIgnoreCase(String name);
}
