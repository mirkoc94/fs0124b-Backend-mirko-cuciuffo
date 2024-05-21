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
@RequestMapping("/posts")
public class PostsController {

    @Autowired
    PostService posts;

    @GetMapping
    public ResponseEntity<List<Post>> getPosts() {
        return null;
    }

    // GET /blogPosts/123 -> id = 123
    @GetMapping("{id}")
    public ResponseEntity<Post> getPost(@PathVariable Long id) {
        return null;
    }

    // POST /blogPosts
    @PostMapping
    public ResponseEntity<Post> save(@RequestBody Post post) {
        return null;
    }

    // PUT /blogPosts/123 -> id = 123
    @PutMapping("{id}")
    public ResponseEntity<Post> update(@PathVariable Long id, @RequestBody Post post) {
        return null;
    }

    // DELETE /blogPosts/123 -> id = 123
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Post delete(@PathVariable Long id) {
        return posts.delete(id);
    }
}
