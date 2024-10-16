package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Bloc;


import java.util.List;

public interface IBlocService {

    public List<Bloc> retrieveAllBlocs();
    public Bloc retrieveBloc(Long blocId);
    public Bloc addBloc(Bloc c);
    public void removeBloc(Long blocId);
    public Bloc modifyBloc(Bloc bloc);

    // Here we will add later methods calling keywords and methods calling JPQL

    public List<Bloc> trouverBlocsSansFoyer();

    public List<Bloc> trouverBlocsParNomEtCap(String nb, long c);



    }
