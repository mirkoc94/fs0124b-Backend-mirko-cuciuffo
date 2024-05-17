package it.epicode.GestionePrenotazioni.dao;

import it.epicode.GestionePrenotazioni.entities.Reservation;

import java.util.Date;
import java.util.List;

public interface ReservationDao {
    public void insert(Reservation reservation); // Create

    public void update(Reservation reservation); // Update

    public void delete(Integer id); // Delete

    public Reservation getById(Integer id); // Read

    public List<Reservation> getByUserUsername(String username);
    public List<Reservation> getByReservationDay(Date reservationDate);
    public List<Reservation> getByReservationDayBetween(Date min, Date max);
}
