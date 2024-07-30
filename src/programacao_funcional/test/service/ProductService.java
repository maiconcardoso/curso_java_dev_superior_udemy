package programacao_funcional.test.service;

import java.util.List;
import java.util.function.Predicate;

import programacao_funcional.test.entities.Product;

public class ProductService {

    public double filteredSum(List<Product> list, Predicate<Product> criteria) {
        double sum = 0.0;
        for (Product p: list) {
            if (criteria.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    } 
}
