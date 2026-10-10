package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.repository.EquipementRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class IEquipementServiceImp implements IEquipementService {
    //@Autowired
    //private EquipementRepository EquipementRepository

    private final EquipementRepository EquipementRepository;

    @Override
    public Equipement ajouterEquipement(Equipement Equipement) {
        return EquipementRepository.save(Equipement);
    }

    @Override
    public Equipement modifierEquipement(Equipement Equipement) {
        return EquipementRepository.save(Equipement);
    }

    @Override
    public List<Equipement> afficherToutesEquipement() {
        return EquipementRepository.findAll();
    }

    @Override
    public Equipement afficherEquipementById(Long id) {
        return EquipementRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimerEquipement(Long id) {
        EquipementRepository.deleteById(id);

    }
}
