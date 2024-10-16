package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;
    private Long capaciteBloc;
    @ManyToOne
    Foyer Foyer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="Bloc")
    private Set<Chambre> Chambre;



}
