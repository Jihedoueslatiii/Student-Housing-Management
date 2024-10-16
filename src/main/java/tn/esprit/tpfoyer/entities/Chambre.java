package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults (level =AccessLevel.PRIVATE)
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idChambre;

     Long numeroChambre;

    @Enumerated(EnumType.STRING)
     TypeChambre typeC;


    @ManyToOne
    Bloc Bloc;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> Reservation;


}
