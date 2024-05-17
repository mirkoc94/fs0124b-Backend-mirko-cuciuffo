package it.epicode.GestionePrenotazioni.dao;

import it.epicode.GestionePrenotazioni.entities.Building;

import java.util.List;

public interface BuildingDao {
    public void insert(Building building); // Create

    public void update(Building building); // Update

    public void delete(Integer id); // Delete

    public Building getById(Integer id); // Read

    public List<Building> getByNameIgnoreCase(String name);
    public List<Building> getByCityIgnoreCase(String city);
}
