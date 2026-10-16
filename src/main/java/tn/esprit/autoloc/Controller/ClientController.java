package tn.esprit.autoloc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.service.IClientService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/Clients")


public class ClientController {
    private final IClientService ClientService;
    @GetMapping("/afficherToutesClient")
    public List<Client> getAllClients(){
        return ClientService.afficherToutesClient();
    }


    @GetMapping("/afficherClientById/{id}")
    public Client getClientById(@PathVariable Long id){
        return ClientService.afficherClientById(id);
    }

    @PostMapping("/ajouterClient")
    public Client ajouterClient(@RequestBody Client Client){
        return ClientService.ajouterClient(Client);
    }

    @PutMapping("/modifierClient")
    public Client modiferClient(@RequestBody Client Client){
        return ClientService.modifierClient(Client);
    }


    @DeleteMapping("/supprimerClient/{idClient}")
    public void supprimerClient(@PathVariable Long idClient){
        ClientService.supprimerClient(idClient);
    }


}
