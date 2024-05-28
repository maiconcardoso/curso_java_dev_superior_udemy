package orientacao_objetos.exercicios.entities;

public class CurrencyConverter {
    public static double priceDolar;
    public static double value;
    public static final int IOF = 6;

    public static double converter() {
        return (priceDolar * value) + ((priceDolar * value) * IOF / 100);
    }
}
