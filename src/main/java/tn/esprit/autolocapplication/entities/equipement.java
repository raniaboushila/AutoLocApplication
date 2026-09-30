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
public class equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long idEquipement;
    String libelle;

    @ManyToMany(mappedBy = "equipements")
    List<vehicule> vehicules;
}