package tn.esprit.autolocapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autolocapplication.entities.contrat;

public interface contratrepository extends JpaRepository<contrat,Long> {
}
