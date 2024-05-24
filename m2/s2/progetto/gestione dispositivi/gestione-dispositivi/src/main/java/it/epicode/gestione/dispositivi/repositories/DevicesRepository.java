package it.epicode.gestione.dispositivi.repositories;

import it.epicode.gestione.dispositivi.entities.Device;
import it.epicode.gestione.dispositivi.entities.Model;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DevicesRepository extends JpaRepository<Device, Long>, PagingAndSortingRepository<Device, Long> {
    Page<Device> findByModel(Model model);
}
