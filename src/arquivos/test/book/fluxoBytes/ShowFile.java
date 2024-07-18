package arquivos.test.book.fluxoBytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Esta versão do programa ShowFile usa uma instrução try-with-resources
 * para fechar automaticamente um arquivo quando ele não é mais necessário
 * 
 * Nota: este código requer o JDK 7 ou posterior.
*/

public class ShowFile {
    public static void main(String[] args) {
        
        int i;

        // Primeiro verifica se um arquivo foi especificado.
        if (args.length != 1) {
            System.out.println("Usage: ShowFile Filename" );
            return;
        }

        // o código a seguir usa try-with-resources para abrir um arquivo
        // e depois fechá-lo automaticamente quando o bloco try é deixado.
        try (FileInputStream fin = new FileInputStream(args[0])){
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
            return;
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred.");
        } 
    }
}
