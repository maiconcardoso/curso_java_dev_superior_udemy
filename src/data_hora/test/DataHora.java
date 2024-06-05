package data_hora.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public static void main(String[] args) {

        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2024-06-06");
        LocalDateTime d05 = LocalDateTime.parse("2024-05-07T06:11:20");
        Instant d06 = Instant.parse("2024-05-07T06:11:39Z");

        LocalDate d07 = LocalDate.of(2022, 04, 3);
        LocalDateTime d08 = LocalDateTime.of(2024, 12, 24, 12, 24, 30);
        
        LocalDate d09 = LocalDate.parse("23/07/2024", df1);
        LocalDateTime d10 = LocalDateTime.parse("23/07/2024 22:30", df2); 

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
    }
}
