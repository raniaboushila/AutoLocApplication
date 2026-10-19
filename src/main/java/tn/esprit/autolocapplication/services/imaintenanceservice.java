package tn.esprit.autolocapplication.services;

import tn.esprit.autolocapplication.entities.maintenance;

public interface imaintenanceservice {

    maintenance addmaintenance(maintenance maintenance);

    void deletemaintenance(maintenance maintenance);

    void updatemaintenance(maintenance maintenance);

    maintenance findmaintenanceById(Long id);
}