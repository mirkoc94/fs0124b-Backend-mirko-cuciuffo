package it.epicode.blog2.repositories;

import it.epicode.blog2.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AuthorsRepository extends JpaRepository<Author, Integer>, PagingAndSortingRepository<Author, Integer> {
}