package tn.esprit.autolocapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autolocapplication.entities.employe;

public interface employerepository  extends JpaRepository<employe,Long> {

}
