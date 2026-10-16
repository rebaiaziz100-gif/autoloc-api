package tn.esprit.autoloc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.service.IPaiementService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/Paiements")


public class PaiementController {
    private final IPaiementService PaiementService;
    @GetMapping("/afficherToutesPaiement")
    public List<Paiement> getAllPaiements(){
        return PaiementService.afficherToutesPaiement();
    }


    @GetMapping("/afficherPaiementById/{id}")
    public Paiement getPaiementById(@PathVariable Long id){
        return PaiementService.afficherPaiementById(id);
    }

    @PostMapping("/ajouterPaiement")
    public Paiement ajouterPaiement(@RequestBody Paiement Paiement){
        return PaiementService.ajouterPaiement(Paiement);
    }

    @PutMapping("/modifierPaiement")
    public Paiement modiferPaiement(@RequestBody Paiement Paiement){
        return PaiementService.modifierPaiement(Paiement);
    }


    @DeleteMapping("/supprimerPaiement/{idPaiement}")
    public void supprimerPaiement(@PathVariable Long idPaiement){
        PaiementService.supprimerPaiement(idPaiement);
    }


}