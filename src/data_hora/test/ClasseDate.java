package data_hora.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClasseDate {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date hoje = new Date();
        Date data = sdf1.parse("21/12/1989");

        System.out.println("Hoje sem formatação: " + hoje);
        System.out.println("Hoje formatado: " + sdf1.format(hoje));
        System.out.println("Hoje com horas: " + sdf2.format(hoje));
        System.out.println("Data: " + sdf2.format(data));

    }
}
