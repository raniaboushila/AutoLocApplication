package tn.esprit.autolocapplication.services;

import tn.esprit.autolocapplication.entities.client;

public interface iclientservice {

    client addclient(client client);

    void deleteclient(client client);

    void updateclient(client client);

    client findclientById(Long id);
}