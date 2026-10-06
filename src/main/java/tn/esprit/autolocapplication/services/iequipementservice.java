package tn.esprit.autolocapplication.services;

import tn.esprit.autolocapplication.entities.equipement;

public interface iequipementservice {

    equipement addequipement(equipement equipement);

    void deleteequipement(equipement equipement);

    void updateequipement(equipement equipement);

    equipement findequipementById(Long id);
}