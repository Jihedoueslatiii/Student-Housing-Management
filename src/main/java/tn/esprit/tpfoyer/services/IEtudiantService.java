package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {

    public List<Etudiant> retrieveAllEtudiants();
    public Etudiant retrieveEtudiant(Long etudiantId);
    public Etudiant addEtudiant(Etudiant c);
    public void removeEtudiant(Long etudiantId);
    public Etudiant modifyEtudiant(Etudiant etudiant);
    public Etudiant recupererEtudiantParCin(long cin);


}
