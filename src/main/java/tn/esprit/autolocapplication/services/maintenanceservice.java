package tn.esprit.autolocapplication.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapplication.entities.maintenance;
import tn.esprit.autolocapplication.repositories.maintenancerepository;

@AllArgsConstructor
@Service
public class maintenanceservice implements imaintenanceservice {

    maintenancerepository maintenancerepository;

    @Override
    public maintenance addmaintenance(maintenance maintenance) {
        return maintenancerepository.save(maintenance);
    }

    @Override
    public void deletemaintenance(maintenance maintenance) {
        maintenancerepository.delete(maintenance);
    }

    @Override
    public void updatemaintenance(maintenance maintenance) {
        maintenancerepository.save(maintenance);
    }

    @Override
    public maintenance findmaintenanceById(Long id) {
        return maintenancerepository.findById(id).orElse(null);
    }
}