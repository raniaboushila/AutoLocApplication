package tn.esprit.autolocapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autolocapplication.entities.paiement;

public interface paiementrepository extends JpaRepository<paiement,Long> {
}
