package DP.Iterator.Coinbase_IteratorQuestion;

import java.util.List;

public class BidirectionalIteratorImpl<T> implements BidirectionalIterator<T> {
    private List<T> elements;
    private int currentIndex = 0;

    public BidirectionalIteratorImpl(List<T> elements) {
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

    @Override
    public Boolean hasPrevious() {
        return currentIndex > 0;
    }

    @Override
    public T previous() {
        if (!hasPrevious()) return null;
        return elements.get(--currentIndex);
    }
}
