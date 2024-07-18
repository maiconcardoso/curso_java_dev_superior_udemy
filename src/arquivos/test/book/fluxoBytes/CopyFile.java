package arquivos.test.book.fluxoBytes;

/*
 * Copia um arquivo de texto.
 * Para suar esse programa, especifique o nome
 * do arquivo de origem e do arquivo de destino.
 * Por exemplo, para copiar um arquivo chamado FIRST.txt
 * em arquivo chamado SECOND.txt, use a linha de comando a 
 * seguir.
 * 
 * java CopyFile FIRST.txt SECOND.txt
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void main(String[] args) {
        int i;

        // Primeiro, verifica se os dois arquivos foram especificados.
        if (args.length != 2) {
            System.out.println("Usage: CopyFile from to.");
            return;
        }

        // Abre e gerencia dois arquivos com a instrução try.
        try (FileInputStream fin = new FileInputStream(args[0]);
                FileOutputStream fout = new FileOutputStream(args[1])) {
            do {
                i = fin.read();
                if (i != -1)
                    fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
