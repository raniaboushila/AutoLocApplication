package tn.esprit.autolocapplication.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapplication.entities.equipement;
import tn.esprit.autolocapplication.repositories.equipementrepository;

@AllArgsConstructor
@Service
public class equipementservice implements iequipementservice {

    equipementrepository equipementrepository;

    @Override
    public equipement addequipement(equipement equipement) {
        return equipementrepository.save(equipement);
    }

    @Override
    public void deleteequipement(equipement equipement) {
        equipementrepository.delete(equipement);
    }

    @Override
    public void updateequipement(equipement equipement) {
        equipementrepository.save(equipement);
    }

    @Override
    public equipement findequipementById(Long id) {
        return equipementrepository.findById(id).orElse(null);
    }
}