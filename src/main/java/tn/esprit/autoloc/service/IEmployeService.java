package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Employe;

import java.util.List;

public interface IEmployeService {
    Employe ajouterEmploye(Employe Employe);
    Employe modifierEmploye(Employe Employe);
    List<Employe> afficherToutesEmploye();
    Employe afficherEmployeById(Long id);

    void supprimerEmploye(Long id);
}
