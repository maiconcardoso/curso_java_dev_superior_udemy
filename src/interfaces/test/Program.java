package interfaces.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import interfaces.test.entities.CarRental;
import interfaces.test.entities.Vehicle;
import interfaces.test.services.BrazilTaxService;
import interfaces.test.services.RentalService;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel: ");
        System.out.print("Modelo do carro: ");
        String carModel = input.nextLine();
        System.out.print("Retirada (dd/mm/yyyy hh:mm): ");
        String start = input.nextLine();
        System.out.print("Retorno (dd/mm/yyyy hh:mm): ");
        String finish = input.nextLine();

        CarRental carRental = new CarRental(LocalDateTime.parse(start, formatter),
                LocalDateTime.parse(finish, formatter), new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = input.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = input.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println("FATURA: ");
        System.out.printf("Pagamento básico: %.2f%n", carRental.getInvoice().getBasicPayment());
        System.out.printf("Imposto: %.2f%n", carRental.getInvoice().getTax());
        System.out.printf("Pagamento Total: %.2f%n", carRental.getInvoice().getTotalPayment());

        input.close();

    }
}
