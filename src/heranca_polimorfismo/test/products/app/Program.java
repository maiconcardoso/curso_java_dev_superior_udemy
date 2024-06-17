package heranca_polimorfismo.test.products.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import heranca_polimorfismo.test.products.entities.ImportedProduct;
import heranca_polimorfismo.test.products.entities.Product;
import heranca_polimorfismo.test.products.entities.UsedProduct;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Product> products = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int number = input.nextInt();

        for (int i=0; i<number; i++) {
            System.out.println("Product #" + (i+1) + " data");
            System.out.print("Common, Used or Imported? (c / u / i): ");
            Character type = input.next().charAt(0);
            input.nextLine();
            if (type == 'i') {
                System.out.print("Name: ");
                String name = input.nextLine();
                System.out.print("Price: ");
                Double price = input.nextDouble();
                System.out.print("Custums fee: ");
                Double custumsFee = input.nextDouble();
                products.add(new ImportedProduct(name, price, custumsFee));
            } else if (type == 'c') {
                System.out.print("Name: ");
                String name = input.nextLine();
                System.out.print("Price: ");
                Double price = input.nextDouble();
                products.add(new Product(name, price));
            } else {
                System.out.print("Name: ");
                String name = input.nextLine();
                System.out.print("Price: ");
                Double price = input.nextDouble();
                input.nextLine();
                System.out.print("Manufacture date: ");
                String manufactureDate = input.nextLine();
                products.add(new UsedProduct(name, price, LocalDate.parse(manufactureDate, formatter)));
            }
        }

        System.out.println();
        for (Product product : products) {
            System.out.println(product.priceTag());
        }

        input.close();
    }
}
