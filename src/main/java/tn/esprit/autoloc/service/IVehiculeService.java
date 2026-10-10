package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule ajouterVehicule(Vehicule Vehicule);
    Vehicule modifierVehicule(Vehicule Vehicule);
    List<Vehicule> afficherToutesVehicule();
    Vehicule afficherVehiculeById(Long id);

    void supprimerVehicule(Long id);
}
