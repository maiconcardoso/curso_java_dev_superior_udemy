package estrutura_sequencial.exercicios;

import java.util.Locale;

public class Exercicio00 {

    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double price3 = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is %.2f%n", product1, price1);
        System.out.printf("%s which price is %.2f%n", product2, price2);

        System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);

        System.out.println("Mesue with eight decimal places " + price3);

        
        System.out.printf("Rouded (Three decimal places): %.3f%n", price3);
        
        Locale.setDefault(Locale.US);

        System.out.printf("US decimal point: %.3f%n", price3);
    }

}
