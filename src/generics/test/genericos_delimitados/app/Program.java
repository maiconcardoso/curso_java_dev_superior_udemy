package generics.test.genericos_delimitados.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import generics.test.genericos_delimitados.entities.Product;
import generics.test.genericos_delimitados.services.CalculationService;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        String path = "/home/maicon-cardoso/Documentos/in.txt";

        try (BufferedReader buffer = new BufferedReader(new FileReader(path))) {
            
            String line = buffer.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);
                list.add(new Product(name, price));
                line = buffer.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most expensive:");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
