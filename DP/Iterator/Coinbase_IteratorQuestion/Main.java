package DP.Iterator.Coinbase_IteratorQuestion;

import DP.Iterator.Iterator;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CoinbaseCollection<Integer> collection = new CoinbaseCollection<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("--- Forward Iterator ---");
        Iterator<Integer> forward = collection.iterator();
        while (forward.hasNext()) {
            System.out.print(forward.next() + " ");
        }
        System.out.println();

        System.out.println("--- Backward Iterator ---");
        Iterator<Integer> backward = collection.backwardIterator();
        while (backward.hasNext()) {
            System.out.print(backward.next() + " ");
        }
        System.out.println();

        System.out.println("--- Bidirectional Iterator ---");
        BidirectionalIterator<Integer> bidirectional = collection.bidirectionalIterator();
        System.out.print("Forward: ");
        while (bidirectional.hasNext()) {
            System.out.print(bidirectional.next() + " ");
        }
        System.out.println();
        System.out.print("Backward (after traversing): ");
        while (bidirectional.hasPrevious()) {
            System.out.print(bidirectional.previous() + " ");
        }
        System.out.println();

        System.out.println("--- Random Iterator ---");
        Iterator<Integer> random = collection.randomIterator();
        while (random.hasNext()) {
            System.out.print(random.next() + " ");
        }
        System.out.println();

        System.out.println("--- Jumper Iterator (step 2) ---");
        Iterator<Integer> jumper = collection.jumperIterator(2);
        while (jumper.hasNext()) {
            System.out.print(jumper.next() + " ");
        }
        System.out.println();
    }
}
