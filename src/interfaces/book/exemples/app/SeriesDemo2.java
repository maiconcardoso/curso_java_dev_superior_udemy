package interfaces.book.exemples.app;

import interfaces.book.exemples.entities.ByThrees;
import interfaces.book.exemples.entities.ByTwos;
import interfaces.book.exemples.entities.Series;

public class SeriesDemo2 {
    public static void main(String[] args) {
        Series twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();

        Series iRef; // Uma referência de interface.

        for (int i=0; i<5; i++) {
            iRef = twoOb; // referencia um objeto ByTwos
            System.out.println("Next ByTwos value is " + iRef.getNext());
            iRef = threeOb; // Referencia um objeto ByThrees
            System.out.println("Next ByThrees value is " + iRef.getNext());
        }
    }
}
