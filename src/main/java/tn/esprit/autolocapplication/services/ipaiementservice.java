package tn.esprit.autolocapplication.services;

import tn.esprit.autolocapplication.entities.paiement;

public interface ipaiementservice {

    paiement addpaiement(paiement paiement);

    void deletepaiement(paiement paiement);

    void updatepaiement(paiement paiement);

    paiement findpaiementById(Long id);
}