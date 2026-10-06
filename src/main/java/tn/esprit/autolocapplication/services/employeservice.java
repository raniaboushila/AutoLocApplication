package tn.esprit.autolocapplication.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapplication.entities.employe;
import tn.esprit.autolocapplication.repositories.employerepository;

@AllArgsConstructor
@Service
public class employeservice implements iemployeservice {

    employerepository employerepository;

    @Override
    public employe addemploye(employe employe) {
        return employerepository.save(employe);
    }

    @Override
    public void deleteemploye(employe employe) {
        employerepository.delete(employe);
    }

    @Override
    public void updateemploye(employe employe) {
        employerepository.save(employe);
    }

    @Override
    public employe findemployeById(Long id) {
        return employerepository.findById(id).orElse(null);
    }
}