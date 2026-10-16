package tn.esprit.autoloc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.service.IMaintenanceService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/Maintenances")


public class MaintenanceController {
    private final IMaintenanceService MaintenanceService;
    @GetMapping("/afficherToutesMaintenance")
    public List<Maintenance> getAllMaintenances(){
        return MaintenanceService.afficherToutesMaintenance();
    }


    @GetMapping("/afficherMaintenanceById/{id}")
    public Maintenance getMaintenanceById(@PathVariable Long id){
        return MaintenanceService.afficherMaintenanceById(id);
    }

    @PostMapping("/ajouterMaintenance")
    public Maintenance ajouterMaintenance(@RequestBody Maintenance Maintenance){
        return MaintenanceService.ajouterMaintenance(Maintenance);
    }

    @PutMapping("/modifierMaintenance")
    public Maintenance modiferMaintenance(@RequestBody Maintenance Maintenance){
        return MaintenanceService.modifierMaintenance(Maintenance);
    }


    @DeleteMapping("/supprimerMaintenance/{idMaintenance}")
    public void supprimerMaintenance(@PathVariable Long idMaintenance){
        MaintenanceService.supprimerMaintenance(idMaintenance);
    }


}