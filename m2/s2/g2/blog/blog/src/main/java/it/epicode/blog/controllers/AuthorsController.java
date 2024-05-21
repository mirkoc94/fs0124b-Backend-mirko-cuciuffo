package it.epicode.blog.controllers;

import it.epicode.blog.entities.Author;
import it.epicode.blog.entities.Post;
import it.epicode.blog.services.AuthorService;
import it.epicode.blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorsController {

    @Autowired
    AuthorService authors;

    @GetMapping
    public ResponseEntity<List<Author>> getAuthors() {
        return null;
    }

    // GET /authors/123 -> id = 123
    @GetMapping("{id}")
    public ResponseEntity<Author> getAuthor(@PathVariable Long id) {
        return null;
    }

    // POST /authors
    @PostMapping
    public ResponseEntity<Author> save(@RequestBody Author author) {
        return null;
    }

    // PUT /authors/123 -> id = 123
    @PutMapping("{id}")
    public ResponseEntity<Author> update(@PathVariable Long id, @RequestBody Author author) {
        return null;
    }

    // DELETE /authors/123 -> id = 123
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Author delete(@PathVariable Long id) {
        return authors.delete(id);
    }
}
