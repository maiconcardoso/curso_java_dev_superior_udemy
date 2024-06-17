package heranca_polimorfismo.test.products.entities;

public class ImportedProduct extends Product {

    private Double custumsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double custumsFee) {
        super(name, price);
        this.custumsFee = custumsFee;
    }

    public Double getCustumsFee() {
        return custumsFee;
    }

    public void setCustumsFee(Double custumsFee) {
        this.custumsFee = custumsFee;
    }

    @Override
    public String priceTag() {
        return getName() + " $ " + String.format("%.2f", getPrice()) + " (Custums fee: "
                + String.format("%.2f", custumsFee) + ")";
    }
}
