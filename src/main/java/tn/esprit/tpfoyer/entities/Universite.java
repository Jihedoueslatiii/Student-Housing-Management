package tn.esprit.tpfoyer.entities;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.mapping.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Universite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;

    private String nomUniversite;
    private String adresse;
    @OneToOne
    private Foyer foyers;

}
