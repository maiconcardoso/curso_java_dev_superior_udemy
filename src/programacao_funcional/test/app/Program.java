package programacao_funcional.test.app;

import java.util.ArrayList;
import java.util.List;

import programacao_funcional.test.entities.MyComparator;
import programacao_funcional.test.entities.Product;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Notebook", 1500.0));
        list.add(new Product("TV", 1780.50));
        list.add(new Product("Iphone", 8500.45));

        list.sort(new MyComparator());

        for (Product p : list) {
            System.out.println(p);
        }

    }
}
