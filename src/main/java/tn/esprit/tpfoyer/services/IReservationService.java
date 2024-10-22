package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Reservation;

import java.util.Date;
import java.util.List;

public interface IReservationService {

    public List<Reservation> retrieveAllReservations();
    public Reservation retrieveReservation(String reservationId);
    public Reservation addReservation(Reservation r);
    public void removeReservation(String reservationId);
    public Reservation modifyReservation(Reservation reservation);


}
