package excecao.exercicios.hotel_reservation.app;

import java.time.LocalDate;

import excecao.exercicios.hotel_reservation.model.entities.Reservation;

public class Program {
    public static void main(String[] args) {
        
        LocalDate dia = LocalDate.of(2024, 06, 04);
        LocalDate hoje = LocalDate.now();

        Reservation reservation = new Reservation(1004, dia, hoje);

        System.out.println(reservation.duration());
    }
}
