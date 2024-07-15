package interfaces.book.exemples.entities;

public class ByTwos implements Series{

    int start;
    int val;
    int priorVal;

    public ByTwos() {
        start = 0;
        val = 0;
        priorVal = -2;
    }

    // Implementa os métodos especificados por Series
    @Override
    public int getNext() {
        priorVal = val;
        return val += 2;
    }

    @Override
    public void reset() {
       val = start;
       priorVal = start - 2;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
        priorVal = x - 2;
    }

    public int getPriorVal() {
        return priorVal;
    }

}
