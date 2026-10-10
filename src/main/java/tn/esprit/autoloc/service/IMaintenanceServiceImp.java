package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.repository.MaintenanceRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class IMaintenanceServiceImp implements IMaintenanceService {
    //@Autowired
    //private MaintenanceRepository MaintenanceRepository

    private final MaintenanceRepository MaintenanceRepository;

    @Override
    public Maintenance ajouterMaintenance(Maintenance Maintenance) {
        return MaintenanceRepository.save(Maintenance);
    }

    @Override
    public Maintenance modifierMaintenance(Maintenance Maintenance) {
        return MaintenanceRepository.save(Maintenance);
    }

    @Override
    public List<Maintenance> afficherToutesMaintenance() {
        return MaintenanceRepository.findAll();
    }

    @Override
    public Maintenance afficherMaintenanceById(Long id) {
        return MaintenanceRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimerMaintenance(Long id) {
        MaintenanceRepository.deleteById(id);

    }
}
