package tn.esprit.autolocapplication.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.autolocapplication.entities.enumeration.roleemploye;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEmploye;
    String nom;
    String prenom;

    @Enumerated(EnumType.STRING)
    roleemploye role;
    @ManyToOne
    agence agence;
}