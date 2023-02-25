package org.scaler.generics;

public class Pair<T extends Comparable<T>> {
    private final T first;
    private final T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public boolean balanced() {
        return first.compareTo(second) == 0;
    }

    public boolean impaired() {
        return first == null || second == null;
    }
}
