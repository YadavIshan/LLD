package DP.Iterator.Coinbase_IteratorQuestion;

import DP.Iterator.Iterator;
import java.util.List;

public class ForwardIterator<T> implements Iterator<T> {
    private List<T> elements;
    private int currentIndex = 0;

    public ForwardIterator(List<T> elements) {
        this.elements = elements;
    }

    @Override
    public Boolean hasNext() {
        return currentIndex < elements.size();
    }

    @Override
    public T next() {
        if (!hasNext()) return null;
        return elements.get(currentIndex++);
    }
}
