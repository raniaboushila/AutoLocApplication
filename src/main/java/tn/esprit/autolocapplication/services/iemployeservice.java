package tn.esprit.autolocapplication.services;

import tn.esprit.autolocapplication.entities.employe;

public interface iemployeservice {

    employe addemploye(employe employe);

    void deleteemploye(employe employe);

    void updateemploye(employe employe);

    employe findemployeById(Long id);
}