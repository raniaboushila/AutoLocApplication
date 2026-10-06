package tn.esprit.autolocapplication.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapplication.entities.client;
import tn.esprit.autolocapplication.repositories.clientrepository;

@AllArgsConstructor
@Service
public class clientservice implements iclientservice {

    clientrepository clientrepository;

    @Override
    public client addclient(client client) {
        return clientrepository.save(client);
    }

    @Override
    public void deleteclient(client client) {
        clientrepository.delete(client);
    }

    @Override
    public void updateclient(client client) {
        clientrepository.save(client);
    }

    @Override
    public client findclientById(Long id) {
        return clientrepository.findById(id).orElse(null);
    }
}