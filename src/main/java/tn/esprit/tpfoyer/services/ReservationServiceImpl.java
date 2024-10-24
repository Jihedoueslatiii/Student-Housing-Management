package tn.esprit.tpfoyer.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Reservation;

import tn.esprit.tpfoyer.repositories.ReservationRepository;


import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {

    ReservationRepository reservationRepository;

    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation retrieveReservation(String reservationId) {
        return reservationRepository.findById(reservationId).get();
    }

    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    public Reservation modifyReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }



    public void removeReservation(String reservationId) {
        reservationRepository.deleteById(reservationId);
    }
}
