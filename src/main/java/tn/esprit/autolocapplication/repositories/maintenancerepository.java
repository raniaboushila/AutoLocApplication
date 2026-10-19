package tn.esprit.autolocapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autolocapplication.entities.maintenance;

public interface maintenancerepository extends JpaRepository<maintenance,Long> {
}
