package tn.esprit.autolocapplication.services;

import tn.esprit.autolocapplication.entities.agence;

public interface iagenceservice {

    agence addagence(agence agence);

    void deleteagence(agence agence);

    void updateagence(agence agence);

    agence findagenceById(Long id);
}