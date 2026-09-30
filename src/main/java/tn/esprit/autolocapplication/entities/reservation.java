package tn.esprit.autolocapplication.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.autolocapplication.entities.enumeration.statutreservation;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long idReservation;
    LocalDate datedebut;
    LocalDate datefin;

    @Enumerated(EnumType.STRING)
    statutreservation statut;

    @ManyToOne
    vehicule vehicule;

    @ManyToOne
    client client;

    @OneToOne
    contrat contrat;
}