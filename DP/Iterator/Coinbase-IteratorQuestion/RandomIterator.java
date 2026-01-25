package DP.Iterator.Coinbase_IteratorQuestion;

import DP.Iterator.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomIterator<T> implements Iterator<T> {
    private List<T> elements;
    private List<Integer> indices;
    private int currentPointer = 0;

    public RandomIterator(List<T> elements) {
        this.elements = elements;
        this.indices = new ArrayList<>();
        for (int i = 0; i < elements.size(); i++) {
            indices.add(i);
        }
        Collections.shuffle(indices);
    }

    @Override
    public Boolean hasNext() {
        return currentPointer < indices.size();
    }

    @Override
    public T next() {
        if (!hasNext()) return null;
        int realIndex = indices.get(currentPointer++);
        return elements.get(realIndex);
    }
}
