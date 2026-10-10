package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.repository.EmployeRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class IEmployeServiceImp implements IEmployeService {
    //@Autowired
    //private EmployeRepository EmployeRepository

    private final EmployeRepository EmployeRepository;

    @Override
    public Employe ajouterEmploye(Employe Employe) {
        return EmployeRepository.save(Employe);
    }

    @Override
    public Employe modifierEmploye(Employe Employe) {
        return EmployeRepository.save(Employe);
    }

    @Override
    public List<Employe> afficherToutesEmploye() {
        return EmployeRepository.findAll();
    }

    @Override
    public Employe afficherEmployeById(Long id) {
        return EmployeRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimerEmploye(Long id) {
        EmployeRepository.deleteById(id);

    }
}
