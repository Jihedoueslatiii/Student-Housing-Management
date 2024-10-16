package tn.esprit.tpfoyer.services;


import tn.esprit.tpfoyer.entities.Universite;

import java.util.List;

public interface IUniversiteService {

    public List<Universite> retrieveAllUniversites();
    public Universite retrieveUniversite(Long universiteId);
    public Universite addUniversite(Universite f);
    public void removeUniversite(Long universiteId);
    public Universite modifyUniversite(Universite universite);

    // Here we will add later methods calling keywords and methods calling JPQL

}
