package interfaces.exercicios.compare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        String path = "/home/maicon-cardoso/Documentos/in.txt";

        try (BufferedReader buffer = new BufferedReader(new FileReader(path))) {

            String name = buffer.readLine();
            while (name != null) {
                list.add(name);
                name = buffer.readLine();
            }

            Collections.sort(list);
            for (String s : list) {
                System.out.println(s);
            }
            
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        
        
    }
}
