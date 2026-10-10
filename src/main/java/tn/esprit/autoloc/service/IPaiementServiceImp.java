package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.repository.PaiementRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class IPaiementServiceImp implements IPaiementService {
    //@Autowired
    //private PaiementRepository PaiementRepository

    private final PaiementRepository PaiementRepository;

    @Override
    public Paiement ajouterPaiement(Paiement Paiement) {
        return PaiementRepository.save(Paiement);
    }

    @Override
    public Paiement modifierPaiement(Paiement Paiement) {
        return PaiementRepository.save(Paiement);
    }

    @Override
    public List<Paiement> afficherToutesPaiement() {
        return PaiementRepository.findAll();
    }

    @Override
    public Paiement afficherPaiementById(Long id) {
        return PaiementRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimerPaiement(Long id) {
        PaiementRepository.deleteById(id);

    }
}
