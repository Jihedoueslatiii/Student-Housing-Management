package tn.esprit.tpfoyer.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entities.Bloc;

import java.util.List;








@Repository
 public interface BlocRepository extends JpaRepository<Bloc, Long> {

 List<Bloc> findAllByCapaciteBlocGreaterThan(long c);
 List<Bloc> findAllByNomBlocStartingWith(String c);
 List<Bloc> findAllByNomBlocAndCapaciteBloc(String nom, long capacite);





}
