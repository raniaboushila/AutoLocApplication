package tn.esprit.autolocapplication.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id_agence;
    String nom;
    String ville;
    String adresse;
    String telephone;
    @OneToMany(mappedBy = "agence")
    List<employe> employes;
    @OneToMany(mappedBy = "agence")
    List<vehicule> vehicules;
}