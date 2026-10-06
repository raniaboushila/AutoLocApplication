package tn.esprit.autolocapplication.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapplication.entities.paiement;
import tn.esprit.autolocapplication.repositories.paiementrepository;

@AllArgsConstructor
@Service
public class paiementservice implements ipaiementservice {

    paiementrepository paiementrepository;

    @Override
    public paiement addpaiement(paiement paiement) {
        return paiementrepository.save(paiement);
    }

    @Override
    public void deletepaiement(paiement paiement) {
        paiementrepository.delete(paiement);
    }

    @Override
    public void updatepaiement(paiement paiement) {
        paiementrepository.save(paiement);
    }

    @Override
    public paiement findpaiementById(Long id) {
        return paiementrepository.findById(id).orElse(null);
    }
}