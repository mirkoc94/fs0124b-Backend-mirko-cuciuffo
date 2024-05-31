package it.epicode.gestione.eventi.datalayer.repositories;

import it.epicode.gestione.eventi.datalayer.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findOneByUsernameAndPassword(String username, String password);
    Optional<UserEntity> findOneByUsername(String username);
}
