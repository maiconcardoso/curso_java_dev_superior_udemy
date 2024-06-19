package excecao.exercicios.hotel_reservation.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

import excecao.exercicios.hotel_reservation.model.entities.Reservation;
import excecao.exercicios.hotel_reservation.model.exception.DomainException;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try{
            System.out.print("Room number: ");
            int number = input.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkIn = LocalDate.parse(input.next(), formatter);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkOut = LocalDate.parse(input.next(), formatter);
    
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
    
            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(input.next(), formatter);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(input.next(), formatter);
    
            reservation.updateDate(checkIn, checkOut);
    
            System.out.println("Reservation: " + reservation);
        } catch (InputMismatchException e) {
            System.out.println("Invalid number.");
        } catch(DomainException e) {
            System.err.println("Error in reservation: " + e.getMessage());
        } catch(DateTimeParseException e) {
            System.out.println("Invalid date format.");
        } catch (RuntimeException e) {
            System.out.println("Unexpected error!");
        } 
        input.close();
    }
}
