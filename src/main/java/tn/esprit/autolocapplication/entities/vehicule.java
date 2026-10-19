package tn.esprit.autolocapplication.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.autolocapplication.entities.enumeration.categorievehicule;
import tn.esprit.autolocapplication.entities.enumeration.statutvehicule;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long idVehicule;
    String immatriculation;
    String marque;
    String modele;

    @Enumerated(EnumType.STRING)
    categorievehicule categorie;

    BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    statutvehicule statut;

    @ManyToOne
    agence agence;

    @OneToMany(mappedBy = "vehicule")
    List<maintenance> maintenances;

    @ManyToMany
    List<equipement> equipements;

    @OneToMany(mappedBy = "vehicule")
    List<reservation> reservations;
}