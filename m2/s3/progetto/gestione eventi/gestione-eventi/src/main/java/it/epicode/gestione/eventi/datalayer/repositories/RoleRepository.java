package it.epicode.gestione.eventi.datalayer.repositories;

import it.epicode.gestione.eventi.datalayer.entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    Optional<RoleEntity> findOneByName(String roleName);
}
