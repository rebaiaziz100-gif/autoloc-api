package tn.esprit.autoloc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.service.IVehiculeService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/Vehicules")


public class VehiculeController {
    private final IVehiculeService VehiculeService;
    @GetMapping("/afficherToutesVehicule")
    public List<Vehicule> getAllVehicules(){
        return VehiculeService.afficherToutesVehicule();
    }


    @GetMapping("/afficherVehiculeById/{id}")
    public Vehicule getVehiculeById(@PathVariable Long id){
        return VehiculeService.afficherVehiculeById(id);
    }

    @PostMapping("/ajouterVehicule")
    public Vehicule ajouterVehicule(@RequestBody Vehicule Vehicule){
        return VehiculeService.ajouterVehicule(Vehicule);
    }

    @PutMapping("/modifierVehicule")
    public Vehicule modiferVehicule(@RequestBody Vehicule Vehicule){
        return VehiculeService.modifierVehicule(Vehicule);
    }


    @DeleteMapping("/supprimerVehicule/{idVehicule}")
    public void supprimerVehicule(@PathVariable Long idVehicule){
        VehiculeService.supprimerVehicule(idVehicule);
    }


}
