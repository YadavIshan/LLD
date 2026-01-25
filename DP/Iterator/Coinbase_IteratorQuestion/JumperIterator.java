package DP.Iterator.Coinbase_IteratorQuestion;

import DP.Iterator.Iterator;
import java.util.List;

public class JumperIterator<T> implements Iterator<T> {
    private List<T> elements;
    private int currentIndex = 0;
    private int step;

    public JumperIterator(List<T> elements, int step) {
        this.elements = elements;
        this.step = step;
    }

    @Override
    public Boolean hasNext() {
        return currentIndex < elements.size();
    }

    @Override
    public T next() {
        if (!hasNext()) return null;
        T item = elements.get(currentIndex);
        currentIndex += step;
        return item;
    }
}
