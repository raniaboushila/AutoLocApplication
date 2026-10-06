package tn.esprit.autolocapplication.services;

import tn.esprit.autolocapplication.entities.contrat;

public interface icontratservice {

    contrat addcontrat(contrat contrat);

    void deletecontrat(contrat contrat);

    void updatecontrat(contrat contrat);

    contrat findcontratById(Long id);
}