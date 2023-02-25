package org.scaler.generics;

public class Pair<E extends Comparable<E>> {
    private final E first;
    private final E second;

    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public boolean balanced() {
        return first.compareTo(second) == 0;
    }

    public boolean impaired() {
        return first == null || second == null;
    }
}
