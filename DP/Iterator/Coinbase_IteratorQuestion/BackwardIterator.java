package DP.Iterator.Coinbase_IteratorQuestion;

import DP.Iterator.Iterator;
import java.util.List;

public class BackwardIterator<T> implements Iterator<T> {
    private List<T> elements;
    private int currentIndex;

    public BackwardIterator(List<T> elements) {
        this.elements = elements;
        this.currentIndex = elements.size() - 1;
    }

    @Override
    public Boolean hasNext() {
        return currentIndex >= 0;
    }

    @Override
    public T next() {
        if (!hasNext()) return null;
        return elements.get(currentIndex--);
    }
}
