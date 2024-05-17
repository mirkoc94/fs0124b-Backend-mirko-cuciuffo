package it.epicode.GestionePrenotazioni.dao;

import it.epicode.GestionePrenotazioni.entities.Reservation;
import it.epicode.GestionePrenotazioni.repositories.ReservationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@Slf4j
public class JpaReservationDao implements ReservationDao{

    @Autowired
    ReservationRepository repo;

    @Override
    public void insert(Reservation reservation) {
        log.info("JpaReservationDao.insert()");
        repo.save(reservation);
    }

    @Override
    public void update(Reservation reservation) {
        log.info("JpaReservationDao.update()");
        repo.save(reservation);
    }

    @Override
    public void delete(Integer id) {
        log.info("JpaReservationDao.delete()");
        repo.deleteById(id);
    }

    @Override
    public Reservation getById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Reservation> getByUserUsername(String username){
        return repo.findByUserUsername(username);
    }

    @Override
    public List<Reservation> getByReservationDay(Date reservationDate){
        return repo.findByReservationDay(reservationDate);
    }

    @Override
    public List<Reservation> getByReservationDayBetween(Date min, Date max) {
        return repo.findByReservationDayBetween(min, max);
    }
}
