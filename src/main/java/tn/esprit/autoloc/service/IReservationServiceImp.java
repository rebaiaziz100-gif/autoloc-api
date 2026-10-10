package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.repository.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class IReservationServiceImp implements IReservationService {
    //@Autowired
    //private ReservationRepository ReservationRepository

    private final ReservationRepository ReservationRepository;

    @Override
    public Reservation ajouterReservation(Reservation Reservation) {
        return ReservationRepository.save(Reservation);
    }

    @Override
    public Reservation modifierReservation(Reservation Reservation) {
        return ReservationRepository.save(Reservation);
    }

    @Override
    public List<Reservation> afficherToutesReservation() {
        return ReservationRepository.findAll();
    }

    @Override
    public Reservation afficherReservationById(Long id) {
        return ReservationRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimerReservation(Long id) {
        ReservationRepository.deleteById(id);

    }
}
