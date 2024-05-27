package orientacao_objetos.test.Main;

import java.util.Locale;
import java.util.Scanner;

import orientacao_objetos.test.entities.Product;

public class ProductProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = input.nextLine();
        System.out.print("Price: ");
        product.price = input.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = input.nextInt();

        System.out.println("Product data: " + product);
        
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = input.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = input.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);


        input.close();
    }
}
