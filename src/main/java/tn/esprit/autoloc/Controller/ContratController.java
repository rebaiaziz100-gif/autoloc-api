package tn.esprit.autoloc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.service.IContratService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/Contrats")


public class ContratController {
    private final IContratService ContratService;
    @GetMapping("/afficherToutesContrat")
    public List<Contrat> getAllContrats(){
        return ContratService.afficherToutesContrat();
    }


    @GetMapping("/afficherContratById/{id}")
    public Contrat getContratById(@PathVariable Long id){
        return ContratService.afficherContratById(id);
    }

    @PostMapping("/ajouterContrat")
    public Contrat ajouterContrat(@RequestBody Contrat Contrat){
        return ContratService.ajouterContrat(Contrat);
    }

    @PutMapping("/modifierContrat")
    public Contrat modiferContrat(@RequestBody Contrat Contrat){
        return ContratService.modifierContrat(Contrat);
    }


    @DeleteMapping("/supprimerContrat/{idContrat}")
    public void supprimerContrat(@PathVariable Long idContrat){
        ContratService.supprimerContrat(idContrat);
    }


}
