package arquivos.test.book.fluxoBytes;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * Desmonstra arquivos de acesso aleatório.
 * Este código requer o JDK 7 ou posterior.
 */


public class RandomAccessDemo {
    public static void main(String[] args) {
        double[] data = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;

        // Abre e usa um arquivo de acesso aleatório.
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
            // Grava valores no arquivo
            for (int i=0; i< data.length; i++) {
                raf.writeDouble(data[i]);
            }

            // Agora, lê valores específicos
            raf.seek(0); // busca o primeiro double
            d = raf.readDouble();
            System.out.println("First value is " + d);

            raf.seek(8); // busca o segundo double
            d = raf.readDouble();
            System.out.println("Second value is " + d);

            raf.seek(8 * 3); // busca o quarto double
            d = raf.readDouble();
            System.out.println("Fourth value is " + d);

            System.out.println();

            // Agora, lê todos os outros valores.
            System.out.println("Here is every other value: ");
            for (int i=0; i<data.length; i+=2) {
                raf.seek(8 * i); // busca o i-ésimo double
                d = raf.readDouble();
                System.out.print(d + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
