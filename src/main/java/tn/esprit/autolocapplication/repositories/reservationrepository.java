package tn.esprit.autolocapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autolocapplication.entities.reservation;

public interface reservationrepository extends JpaRepository<reservation,Long> {
}
