package arquivos.test.book;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Exibe um arquivo de texto.
 * 
 * Para usar este programa, especifique o nome
 * do arquivo que deseja ver.
 * Por exemplo, para ver um arquivo chamado TEST.txt,
 * use a linha de comando abaixo.
 * 
 * java ShowFile TEST.txt
*/

public class ShowFile {
    public static void main(String[] args) {
        
        int i;
        FileInputStream fin;

        // Primeiro verifica se um arquivo foi especificado.

        if (args.length != 1) {
            System.out.println("Usage: ShowFile File" );
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
            return;
        }

        try {
            // lê bytes até o EOF ser alcançado.
            do {
                i = fin.read();
                if (i != -1) 
                    System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error reading file.");
        } finally {
            try {
                fin.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
