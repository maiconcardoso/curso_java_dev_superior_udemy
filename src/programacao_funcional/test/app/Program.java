package programacao_funcional.test.app;

import java.util.ArrayList;
import java.util.List;

import programacao_funcional.test.entities.Product;
import programacao_funcional.test.util.MyPredicate;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.removeIf(new MyPredicate());

        for (Product p : list) {
            System.out.println(p);
        }

    }
}
