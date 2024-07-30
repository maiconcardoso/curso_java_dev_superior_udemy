package programacao_funcional.test.util;

import java.util.function.Function;

import programacao_funcional.test.entities.Product;

public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }

}
