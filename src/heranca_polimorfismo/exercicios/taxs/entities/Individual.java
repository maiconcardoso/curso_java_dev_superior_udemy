package heranca_polimorfismo.exercicios.taxs.entities;

public class Individual extends TaxPayer {

    private Double helthExpenditures;

    public Individual() {}

    public Individual(String name, Double anualIncome, Double helthExpenditures) {
        super(name, anualIncome);
        this.helthExpenditures = helthExpenditures;
    }

    @Override
    public Double tax() {
        if (super.getAnualIncome() < 20000.00) {
            return (super.getAnualIncome() * 0.15) - (helthExpenditures * 0.5);
        } else {
            return (super.getAnualIncome() * 0.25) - (helthExpenditures * 0.5);
        }
    }

    public Double getHelthExpenditures() {
        return helthExpenditures;
    }

    public void setHelthExpenditures(Double helthExpenditures) {
        this.helthExpenditures = helthExpenditures;
    }

}
