package tn.esprit.autolocapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autolocapplication.entities.vehicule;

public interface vehiculerepository extends JpaRepository<vehicule,Long> {
}
