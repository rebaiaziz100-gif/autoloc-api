package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement ajouterEquipement(Equipement Equipement);
    Equipement modifierEquipement(Equipement Equipement);
    List<Equipement> afficherToutesEquipement();
    Equipement afficherEquipementById(Long id);

    void supprimerEquipement(Long id);
}
