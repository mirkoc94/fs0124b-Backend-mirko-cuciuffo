package it.epicode.blog2.services;

import it.epicode.blog2.entities.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface AuthorService {

    Page<Author> getAuthors(Pageable p);

    Optional<Author> getAuthor(Long id);

    Author save(Author author);

    Author update(Long authorId, Author author);

    Author delete(Long authorId);
}
