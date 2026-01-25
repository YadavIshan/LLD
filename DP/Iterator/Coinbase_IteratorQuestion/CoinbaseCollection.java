package DP.Iterator.Coinbase_IteratorQuestion;

import DP.Iterator.Iterator;
import java.util.ArrayList;
import java.util.List;

public class CoinbaseCollection<T> {
    private List<T> elements;

    public CoinbaseCollection(List<T> elements) {
        this.elements = new ArrayList<>(elements);
    }

    public void add(T element) {
        elements.add(element);
    }

    // 1. Forward Iterator
    public Iterator<T> iterator() {
        return new ForwardIterator<>(elements);
    }

    // 2. Backward Iterator
    public Iterator<T> backwardIterator() {
        return new BackwardIterator<>(elements);
    }

    // 3. Bidirectional Iterator
    public BidirectionalIterator<T> bidirectionalIterator() {
        return new BidirectionalIteratorImpl<>(elements);
    }

    // 4. Random Iterator
    public Iterator<T> randomIterator() {
        return new RandomIterator<>(elements);
    }

    // 5. Jumper Iterator
    public Iterator<T> jumperIterator(int step) {
        return new JumperIterator<>(elements, step);
    }
}
