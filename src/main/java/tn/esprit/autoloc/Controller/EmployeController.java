package tn.esprit.autoloc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.service.IEmployeService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/Employes")


public class EmployeController {
    private final IEmployeService EmployeService;
    @GetMapping("/afficherToutesEmploye")
    public List<Employe> getAllEmployes(){
        return EmployeService.afficherToutesEmploye();
    }


    @GetMapping("/afficherEmployeById/{id}")
    public Employe getEmployeById(@PathVariable Long id){
        return EmployeService.afficherEmployeById(id);
    }

    @PostMapping("/ajouterEmploye")
    public Employe ajouterEmploye(@RequestBody Employe Employe){
        return EmployeService.ajouterEmploye(Employe);
    }

    @PutMapping("/modifierEmploye")
    public Employe modiferEmploye(@RequestBody Employe Employe){
        return EmployeService.modifierEmploye(Employe);
    }


    @DeleteMapping("/supprimerEmploye/{idEmploye}")
    public void supprimerEmploye(@PathVariable Long idEmploye){
        EmployeService.supprimerEmploye(idEmploye);
    }


}
