package io.codelavida.ds;

public interface PriorityQueue<K, V> {
    int size();

    boolean isEmpty();

    void insert(K key, V value);

    void min();

    void removeMin();
}
