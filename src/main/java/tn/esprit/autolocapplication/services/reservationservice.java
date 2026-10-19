package tn.esprit.autolocapplication.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapplication.entities.reservation;
import tn.esprit.autolocapplication.repositories.reservationrepository;

@AllArgsConstructor
@Service
public class reservationservice implements ireservationservice {

    reservationrepository reservationrepository;

    @Override
    public reservation addreservation(reservation reservation) {
        return reservationrepository.save(reservation);
    }

    @Override
    public void deletereservation(reservation reservation) {
        reservationrepository.delete(reservation);
    }

    @Override
    public void updatereservation(reservation reservation) {
        reservationrepository.save(reservation);
    }

    @Override
    public reservation findreservationById(Long id) {
        return reservationrepository.findById(id).orElse(null);
    }
}