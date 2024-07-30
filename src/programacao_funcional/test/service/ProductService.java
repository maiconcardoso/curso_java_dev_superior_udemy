package programacao_funcional.test.service;

import java.util.List;

import programacao_funcional.test.entities.Product;

public class ProductService {

    public double filteredSum(List<Product> list) {
        double sum = 0.0;
        for (Product p: list) {
            if (p.getName().charAt(0) == 'T') {
                sum += p.getPrice();
            }
        }
        return sum;
    } 
}
