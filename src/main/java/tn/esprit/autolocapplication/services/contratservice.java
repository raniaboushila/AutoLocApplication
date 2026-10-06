package tn.esprit.autolocapplication.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapplication.entities.contrat;
import tn.esprit.autolocapplication.repositories.contratrepository;

@AllArgsConstructor
@Service
public class contratservice implements icontratservice {

    contratrepository contratrepository;

    @Override
    public contrat addcontrat(contrat contrat) {
        return contratrepository.save(contrat);
    }

    @Override
    public void deletecontrat(contrat contrat) {
        contratrepository.delete(contrat);
    }

    @Override
    public void updatecontrat(contrat contrat) {
        contratrepository.save(contrat);
    }

    @Override
    public contrat findcontratById(Long id) {
        return contratrepository.findById(id).orElse(null);
    }
}