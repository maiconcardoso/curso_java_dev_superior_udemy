package set_map.test.set.app;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import set_map.test.set.entities.Product;

public class Program {
    public static void main(String[] args) {
        
        Set<Product> set = new TreeSet<>();

        set.add(new Product("Notebook", 1200.00));
        set.add(new Product("Calculadora", 200.00));
        set.add(new Product("Tablet", 2500.00));

        for (Product p: set) {
            System.out.println(p);
        }
        
    }
}
