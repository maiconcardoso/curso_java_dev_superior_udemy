package programacao_funcional.test.util;

import java.util.function.Predicate;

import programacao_funcional.test.entities.Product;

public class MyPredicate implements Predicate<Product>{

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100;
    }

}
