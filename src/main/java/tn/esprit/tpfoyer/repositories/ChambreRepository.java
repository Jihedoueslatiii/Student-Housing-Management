package tn.esprit.tpfoyer.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.TypeChambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {





























// Trouver toutes les chambres qui sont de typ SIMPlE :



    List<Chambre> findAllByTypeC(TypeChambre tc);




    /* No need to code CRUD here. Its is already in the
    interfaces provided by the framework Spring Data JPA :
       - CrudRepository or
       - PagingAndSortingRepository or
       - JpaRepository
     */





    Chambre findChambreByNumeroChambre(Long num);





    // Recperer la chambre selon le CIN de l'étudiant qui l'occupe :
    @Query("SELECT ch FROM Chambre ch " +
            "INNER JOIN ch.Reservation r " +
            "INNER JOIN r.Etudiant e " +
            "WHERE e.cin=:cin ")
    Chambre trouverChselonEt(long cin);







}
