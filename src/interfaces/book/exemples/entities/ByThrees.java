package interfaces.book.exemples.entities;

public class ByThrees implements Series{

    int start;
    int val;

    public ByThrees() {
        start = 0;
        val = 0;
    }

    // Implementa os métodos especificados por series.
    @Override
    public int getNext() {
       return val += 3;
    }

    @Override
    public void reset() {
        val = start;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
    }

}
