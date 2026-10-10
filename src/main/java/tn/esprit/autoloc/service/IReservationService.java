package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation ajouterReservation(Reservation Reservation);
    Reservation modifierReservation(Reservation Reservation);
    List<Reservation> afficherToutesReservation();
    Reservation afficherReservationById(Long id);

    void supprimerReservation(Long id);
}
