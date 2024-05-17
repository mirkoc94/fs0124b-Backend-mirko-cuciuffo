package it.epicode.GestionePrenotazioni.dao;

import it.epicode.GestionePrenotazioni.entities.Building;
import it.epicode.GestionePrenotazioni.repositories.BuildingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class JpaBuildingDao implements BuildingDao {

    @Autowired
    BuildingRepository repo;

    @Override
    public void insert(Building building) {
        log.info("JpaBuildingDao.insert()");
        repo.save(building);
    }

    @Override
    public void update(Building building) {
        log.info("JpaBuildingDao.update()");
        repo.save(building);
    }

    @Override
    public void delete(Integer id) {
        log.info("JpaBuildingDao.delete()");
        repo.deleteById(id);
    }

    @Override
    public Building getById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Building> getByNameIgnoreCase(String name) {
        return repo.findByNameIgnoreCase(name);
    }

    @Override
    public List<Building> getByCityIgnoreCase(String city) {
        return repo.findByCityIgnoreCase(city);
    }


}
