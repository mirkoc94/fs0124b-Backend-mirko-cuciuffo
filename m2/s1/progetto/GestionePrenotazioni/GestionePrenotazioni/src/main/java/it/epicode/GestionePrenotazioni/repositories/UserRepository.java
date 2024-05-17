package it.epicode.GestionePrenotazioni.repositories;

import it.epicode.GestionePrenotazioni.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByUsername(String username);
    List<User> findByEmail(String email);
}
