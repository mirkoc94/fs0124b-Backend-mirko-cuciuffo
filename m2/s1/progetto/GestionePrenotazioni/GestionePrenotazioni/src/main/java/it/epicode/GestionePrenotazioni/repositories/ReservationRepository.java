package it.epicode.GestionePrenotazioni.repositories;

import it.epicode.GestionePrenotazioni.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

    List<Reservation> findByUserUsername(String username);
    List<Reservation> findByReservationDay(Date reservationDate);
    List<Reservation> findByReservationDayBetween(Date min, Date max);
}
