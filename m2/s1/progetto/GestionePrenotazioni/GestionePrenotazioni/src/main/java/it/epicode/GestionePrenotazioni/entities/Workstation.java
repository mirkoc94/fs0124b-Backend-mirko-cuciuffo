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
@Table(name = "workstations")
@Builder(setterPrefix = "with")
public class Workstation {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(length = 255, nullable = false)
    private String description;
    @Column(nullable = false)
    private TypeWS typeWS;
    @Column(nullable = false)
    private int maxUsers;
    @ManyToOne
    private Building building;
    @Column(nullable = false)
    private boolean isFree = true;
    @OneToMany(mappedBy = "workstation")
    private List<Reservation> reservations = new ArrayList<>();
}
