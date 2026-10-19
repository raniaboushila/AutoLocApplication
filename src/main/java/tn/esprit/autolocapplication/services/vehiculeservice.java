package tn.esprit.autolocapplication.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapplication.entities.vehicule;
import tn.esprit.autolocapplication.repositories.vehiculerepository;

@AllArgsConstructor
@Service
public class vehiculeservice implements ivehiculeservice {

    vehiculerepository vehiculerepository;

    @Override
    public vehicule addvehicule(vehicule vehicule) {
        return vehiculerepository.save(vehicule);
    }

    @Override
    public void deletevehicule(vehicule vehicule) {
        vehiculerepository.delete(vehicule);
    }

    @Override
    public void updatevehicule(vehicule vehicule) {
        vehiculerepository.save(vehicule);
    }

    @Override
    public vehicule findvehiculeById(Long id) {
        return vehiculerepository.findById(id).orElse(null);
    }
}