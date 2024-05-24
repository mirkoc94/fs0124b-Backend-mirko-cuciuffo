package it.epicode.gestione.dispositivi.repositories;

import it.epicode.gestione.dispositivi.entities.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface EmployeesRepository extends JpaRepository<Employee, Long>, PagingAndSortingRepository<Employee, Long> {
    Page<Employee> findByEmailOrUsername(String email, String username);
}
