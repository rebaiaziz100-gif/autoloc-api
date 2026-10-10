package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance ajouterMaintenance(Maintenance Maintenance);
    Maintenance modifierMaintenance(Maintenance Maintenance);
    List<Maintenance> afficherToutesMaintenance();
    Maintenance afficherMaintenanceById(Long id);

    void supprimerMaintenance(Long id);
}
