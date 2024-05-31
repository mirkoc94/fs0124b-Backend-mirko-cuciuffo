package it.epicode.gestione.eventi.businesslayer.services;

import it.epicode.gestione.eventi.datalayer.entities.EventEntity;
import it.epicode.gestione.eventi.datalayer.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public List<EventEntity> findAllEvents() {
        return eventRepository.findAll();
    }

    public EventEntity saveEvent(EventEntity event) {
        return eventRepository.save(event);
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }
}
