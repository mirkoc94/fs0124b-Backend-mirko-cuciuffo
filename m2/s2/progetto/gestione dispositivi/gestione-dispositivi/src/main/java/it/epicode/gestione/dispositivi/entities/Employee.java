package it.epicode.gestione.dispositivi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employees", indexes = { @Index(name = "idx_email_unique", columnList = "email", unique = true) })
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    @Column(length = 25, nullable = false)
    private String username;
    @Column(length = 25, nullable = false)
    private String firstname;
    @Column(length = 25, nullable = false)
    private String lastname;
    @Column(length = 100, nullable = false)
    private String email;
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Device>devices = new ArrayList<>();
    private String avatar;
}
