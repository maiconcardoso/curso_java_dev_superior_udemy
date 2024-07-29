package programacao_funcional.test.util;

import java.util.function.Consumer;

import programacao_funcional.test.entities.Product;

public class PriceUpdate implements Consumer<Product>{

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

}
