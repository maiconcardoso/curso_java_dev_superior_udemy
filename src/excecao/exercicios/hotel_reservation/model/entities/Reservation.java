package excecao.exercicios.hotel_reservation.model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import excecao.exercicios.hotel_reservation.model.exception.DomainException;

public class Reservation {

    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws DomainException{
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date.");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public Integer duration() {
        return getCheckOut().getDayOfMonth() - getCheckIn().getDayOfMonth();
    }

    public void updateDate(LocalDate checkIn, LocalDate checkOut) throws DomainException {
        LocalDate now = LocalDate.now();
        if (checkIn.isBefore(now) || checkOut.isBefore(now)) {
            throw new DomainException("Reservation dates for update must be future.");
        }
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date.");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room "
                + roomNumber
                + ", check-in: "
                + formatter.format(checkIn)
                + ", check-out: "
                + formatter.format(checkOut)
                + ", "
                + duration()
                + " nights";
    }

}
