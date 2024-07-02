package interfaces.test.services;

public class BrazilTaxService {

    public double tax(double amount) {
        if (amount <= 100.00) {
            return amount * 0.02;
        } else {
            return amount * 0.15;
        }
    }
}
