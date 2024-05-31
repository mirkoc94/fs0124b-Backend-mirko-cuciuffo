package it.epicode.gestione.eventi.datalayer.repositories;

import it.epicode.gestione.eventi.datalayer.entities.EventEntity;
import it.epicode.gestione.eventi.datalayer.entities.ReservationEntity;
import it.epicode.gestione.eventi.datalayer.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {
    List<ReservationEntity> findByUser(UserEntity user);
    List<ReservationEntity> findByEvent(EventEntity event);
}
