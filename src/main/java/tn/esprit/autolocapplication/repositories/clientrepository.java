package tn.esprit.autolocapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autolocapplication.entities.client;

public interface clientrepository extends JpaRepository<client,Long> {
}
