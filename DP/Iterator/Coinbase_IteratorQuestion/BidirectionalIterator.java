package DP.Iterator.Coinbase_IteratorQuestion;

import DP.Iterator.Iterator;

public interface BidirectionalIterator<T> extends Iterator<T> {
    Boolean hasPrevious();
    T previous();
}
