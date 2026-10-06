package tn.esprit.autolocapplication.services;

import tn.esprit.autolocapplication.entities.vehicule;

public interface ivehiculeservice {

    vehicule addvehicule(vehicule vehicule);

    void deletevehicule(vehicule vehicule);

    void updatevehicule(vehicule vehicule);

    vehicule findvehiculeById(Long id);
}