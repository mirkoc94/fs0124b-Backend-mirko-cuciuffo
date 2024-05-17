package it.epicode.GestionePrenotazioni.dao;

import it.epicode.GestionePrenotazioni.entities.Building;
import it.epicode.GestionePrenotazioni.entities.TypeWS;
import it.epicode.GestionePrenotazioni.entities.Workstation;
import it.epicode.GestionePrenotazioni.repositories.WorkstationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class JpaWorkstationDao implements WorkstationDao {

    @Autowired
    WorkstationRepository repo;

    @Override
    public void insert(Workstation workstation) {
        log.info("JpaWorkstationDao.insert()");
        repo.save(workstation);
    }

    @Override
    public void update(Workstation workstation) {
        log.info("JpaWorkstationDao.update()");
        repo.save(workstation);
    }

    @Override
    public void delete(Integer id) {
        log.info("JpaWorkstationDao.delete()");
        repo.deleteById(id);
    }

    @Override
    public Workstation getById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Workstation> getByBuildingNameIgnoreCase(String name) {
        return repo.findByBuildingNameIgnoreCase(name);
    }


}
