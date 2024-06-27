package arquivos.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFileAndBuff {

    public static void main(String[] args) {
        String[] lines = {"Good Morning", "Good Afternoon", "Good Night"};

        String path = "/home/maicon-cardoso/Documentos/out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line: lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
