package it.epicode.GestionePrenotazioni.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@Builder(setterPrefix = "with")
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(length = 15, nullable = false)
    private String username;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(length = 35, nullable = false)
    private String email;
    @OneToMany(mappedBy = "user")
    private List<Reservation> reservations = new ArrayList<>();
}