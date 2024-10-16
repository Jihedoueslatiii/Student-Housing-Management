package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Foyer;

import java.util.List;

public interface IFoyerService {

    public List<Foyer> retrieveAllFoyers();
    public Foyer retrieveFoyer(Long foyerId);
    public Foyer addFoyer(Foyer f);
    public void removeFoyer(Long foyerId);
    public Foyer modifyFoyer(Foyer foyer);

    // Here we will add later methods calling keywords and methods calling JPQL

}