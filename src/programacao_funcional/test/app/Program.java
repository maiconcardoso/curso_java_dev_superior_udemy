package programacao_funcional.test.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import programacao_funcional.test.entities.Product;
import programacao_funcional.test.service.ProductService;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        ProductService ps = new ProductService();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double sum = ps.filteredSum(list);

        System.out.printf("Soma: %.2f%n", sum);

        

    }
}
