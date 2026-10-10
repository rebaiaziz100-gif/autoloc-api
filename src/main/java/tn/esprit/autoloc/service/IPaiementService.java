package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement ajouterPaiement(Paiement Paiement);
    Paiement modifierPaiement(Paiement Paiement);
    List<Paiement> afficherToutesPaiement();
    Paiement afficherPaiementById(Long id);

    void supprimerPaiement(Long id);
}
