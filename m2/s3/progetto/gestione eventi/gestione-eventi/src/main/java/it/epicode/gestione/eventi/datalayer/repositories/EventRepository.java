package it.epicode.gestione.eventi.datalayer.repositories;

import it.epicode.gestione.eventi.datalayer.entities.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventEntity, Long> {
}
