package tn.esprit.autolocapplication.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.autolocapplication.entities.enumeration.modepaiement;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long idPaiement;
    BigDecimal montant;
    LocalDate datepaiement;

    @Enumerated(EnumType.STRING)
    modepaiement modePaiement;

    @ManyToOne
    contrat contrat;
}