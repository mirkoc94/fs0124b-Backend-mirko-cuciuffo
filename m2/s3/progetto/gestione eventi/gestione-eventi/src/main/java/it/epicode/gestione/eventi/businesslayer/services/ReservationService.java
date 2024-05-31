package it.epicode.gestione.eventi.businesslayer.services;

import it.epicode.gestione.eventi.datalayer.entities.ReservationEntity;
import it.epicode.gestione.eventi.datalayer.entities.UserEntity;
import it.epicode.gestione.eventi.datalayer.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public List<ReservationEntity> findByUser(UserEntity user) {
        return reservationRepository.findByUser(user);
    }

    public ReservationEntity saveReservation(ReservationEntity reservation) {
        return reservationRepository.save(reservation);
    }

    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}
