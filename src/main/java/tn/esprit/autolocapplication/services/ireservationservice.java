package tn.esprit.autolocapplication.services;

import tn.esprit.autolocapplication.entities.reservation;
import java.util.List;

public interface ireservationservice {

    reservation addreservation(reservation reservation);

    void deletereservation(reservation reservation);

    void updatereservation(reservation reservation);

    reservation findreservationById(Long id);
}