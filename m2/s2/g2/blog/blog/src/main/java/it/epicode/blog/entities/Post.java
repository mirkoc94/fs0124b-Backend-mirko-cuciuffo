package it.epicode.blog.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "posts")
@Data
@Builder(setterPrefix = "with")
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private String category;
    @Column(length = 80, nullable = false)
    private String title;
    @Column(length = 255, nullable = true)
    private String cover;
    @Column(length = 2048, nullable = false)
    private String content;
    private int readingTime;
    @ManyToOne
    private Author author;
}

