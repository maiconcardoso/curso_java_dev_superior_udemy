package enumeracao.exercicios.exercicio03.program;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import enumeracao.exercicios.exercicio03.entities.Client;
import enumeracao.exercicios.exercicio03.entities.Order;
import enumeracao.exercicios.exercicio03.entities.OrderItem;
import enumeracao.exercicios.exercicio03.entities.Product;
import enumeracao.exercicios.exercicio03.entities.enums.OrderStatus;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        DateTimeFormatter birthDateformatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter orderMomentformatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Email: ");
        String email = input.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = input.next();
        Client client = new Client(name, email, LocalDate.parse(birthDate, birthDateformatter));

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = input.next();
        
        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);

        System.out.print("How many items to this order? ");
        int quantityItems = input.nextInt();

        for (int i = 0; i < quantityItems; i++) {
            System.out.println("Enter #" + (i + 1) + " data: ");

            System.out.print("Product name: ");
            String productName = input.next();
            System.out.print("Product price: ");
            double price = input.nextDouble();
            
            Product product = new Product(productName, price);

            System.out.print("Quantity: ");
            int quantity = input.nextInt();

            OrderItem orderItem = new OrderItem(quantity, price, product);
            order.addItem(orderItem);    
        }
        
        System.out.println();
        System.out.println("ORDER SUMMARY");
        System.out.println("Order moment: " + order.getMoment().format(orderMomentformatter));
        System.out.println("Order status: " + order.getStatus());
        System.out.println(client);
        System.out.println("OrderItems: ");
        System.out.print(order.getOrderItems());
        System.out.println("Total price: " + order.total());

        input.close();
    }
}
