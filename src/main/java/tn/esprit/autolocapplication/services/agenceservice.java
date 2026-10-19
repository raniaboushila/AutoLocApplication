package tn.esprit.autolocapplication.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapplication.entities.agence;
import tn.esprit.autolocapplication.repositories.agencerepository;

@AllArgsConstructor
@Service
public class agenceservice implements iagenceservice {

    agencerepository agencerepository;

    @Override
    public agence addagence(agence agence) {
        return agencerepository.save(agence);
    }

    @Override
    public void deleteagence(agence agence) {
        agencerepository.delete(agence);
    }

    @Override
    public void updateagence(agence agence) {
        agencerepository.save(agence);
    }

    @Override
    public agence findagenceById(Long id) {
        agence agence = agencerepository.findById(id).orElse(null);
        return agence;
    }
}