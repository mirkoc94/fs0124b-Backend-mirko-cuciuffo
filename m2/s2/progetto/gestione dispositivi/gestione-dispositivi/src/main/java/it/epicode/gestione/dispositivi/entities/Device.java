package it.epicode.gestione.dispositivi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "devices")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class Device {
    @Id
    @GeneratedValue
    private Long id;
    private Model model;
    private Availability availability;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
