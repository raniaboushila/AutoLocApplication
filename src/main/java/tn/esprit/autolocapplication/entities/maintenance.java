package tn.esprit.autolocapplication.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long idMaintenance;
    LocalDate datedebut;
    LocalDate datefin;
    String description;

    @ManyToOne
    vehicule vehicule;
}