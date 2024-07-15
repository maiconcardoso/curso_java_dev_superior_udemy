package set_map.exercicios.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import set_map.exercicios.entities.LogEntry;

public class Program {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file full path: ");
        String path = input.nextLine();

        try (BufferedReader buffer = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> set = new HashSet<>();
            String line = buffer.readLine();
            while (line != null) {
                String[] fields = line.split(" ");
                String username = fields[0];
                Instant moment = Instant.parse(fields[1]);

                LogEntry logEntry = new LogEntry(username, moment);

                set.add(logEntry);
                
                line = buffer.readLine();
            }
            System.out.println("Total users: " + set.size());
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
}
