package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.repository.VehiculeRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class IVehiculeServiceImp implements IVehiculeService {
    //@Autowired
    //private VehiculeRepository VehiculeRepository

    private final VehiculeRepository VehiculeRepository;

    @Override
    public Vehicule ajouterVehicule(Vehicule Vehicule) {
        return VehiculeRepository.save(Vehicule);
    }

    @Override
    public Vehicule modifierVehicule(Vehicule Vehicule) {
        return VehiculeRepository.save(Vehicule);
    }

    @Override
    public List<Vehicule> afficherToutesVehicule() {
        return VehiculeRepository.findAll();
    }

    @Override
    public Vehicule afficherVehiculeById(Long id) {
        return VehiculeRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimerVehicule(Long id) {
        VehiculeRepository.deleteById(id);

    }
}
