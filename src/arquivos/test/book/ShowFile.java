package arquivos.test.book;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Esta variação enapsula o código que abre e 
 * acessa o arquivo dentro do mesmo bloco try.
 * O arquivo é fechado pelo bloco finally.
*/

public class ShowFile {
    public static void main(String[] args) {
        
        int i;
        FileInputStream fin = null;

        // Primeiro verifica se um arquivo foi especificado.
        if (args.length != 1) {
            System.out.println("Usage: ShowFile Filename" );
            return;
        }

        // o código a seguir abre um arquivo, lê caracteres até EOF
        // ser alcançado e então fecha o arquivo via um bloco finally
        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
            return;
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred.");
        } finally {

            // Fecha o arquivo em todos os casos
            try {
                if (fin != null)
                    fin.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
