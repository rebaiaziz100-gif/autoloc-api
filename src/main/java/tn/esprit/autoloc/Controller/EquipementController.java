package tn.esprit.autoloc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.service.IEquipementService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/Equipements")


public class EquipementController {
    private final IEquipementService EquipementService;
    @GetMapping("/afficherToutesEquipement")
    public List<Equipement> getAllEquipements(){
        return EquipementService.afficherToutesEquipement();
    }


    @GetMapping("/afficherEquipementById/{id}")
    public Equipement getEquipementById(@PathVariable Long id){
        return EquipementService.afficherEquipementById(id);
    }

    @PostMapping("/ajouterEquipement")
    public Equipement ajouterEquipement(@RequestBody Equipement Equipement){
        return EquipementService.ajouterEquipement(Equipement);
    }

    @PutMapping("/modifierEquipement")
    public Equipement modiferEquipement(@RequestBody Equipement Equipement){
        return EquipementService.modifierEquipement(Equipement);
    }


    @DeleteMapping("/supprimerEquipement/{idEquipement}")
    public void supprimerEquipement(@PathVariable Long idEquipement){
        EquipementService.supprimerEquipement(idEquipement);
    }


}
