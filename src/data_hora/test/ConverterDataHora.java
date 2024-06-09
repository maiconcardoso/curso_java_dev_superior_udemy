package data_hora.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConverterDataHora {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2024-06-06");
        LocalDateTime d02 = LocalDateTime.parse("2024-06-06T01:30:25");
        Instant d03 = Instant.parse("2024-06-06T01:30:25Z");

        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

        System.out.println("d01 = " + d01.format(df1));
        System.out.println("d02 = " + d02.format(df2));
        System.out.println("d03 = " + df3.format(d03));
    }
}
