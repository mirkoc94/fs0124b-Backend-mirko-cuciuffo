package it.epicode.blog2.services;

import it.epicode.blog2.entities.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    List<Post> getPosts();

    Optional<Post> getPost(Long id);

    Post save(Post post);

    Post update(Long postId, Post post);

    Post delete(Long postId);
}
