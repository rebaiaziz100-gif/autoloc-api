package tn.esprit.autoloc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.service.IReservationService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/Reservations")


public class ReservationController {
    private final IReservationService ReservationService;
    @GetMapping("/afficherToutesReservation")
    public List<Reservation> getAllReservations(){
        return ReservationService.afficherToutesReservation();
    }


    @GetMapping("/afficherReservationById/{id}")
    public Reservation getReservationById(@PathVariable Long id){
        return ReservationService.afficherReservationById(id);
    }

    @PostMapping("/ajouterReservation")
    public Reservation ajouterReservation(@RequestBody Reservation Reservation){
        return ReservationService.ajouterReservation(Reservation);
    }

    @PutMapping("/modifierReservation")
    public Reservation modiferReservation(@RequestBody Reservation Reservation){
        return ReservationService.modifierReservation(Reservation);
    }


    @DeleteMapping("/supprimerReservation/{idReservation}")
    public void supprimerReservation(@PathVariable Long idReservation){
        ReservationService.supprimerReservation(idReservation);
    }


}
