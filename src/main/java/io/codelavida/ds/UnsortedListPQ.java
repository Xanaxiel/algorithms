package io.codelavida.ds;

import java.util.LinkedList;

/**
 * Priority Queue based on Unsorted Linked List. The Runtime complexities of
 * this PQ are:
 * <p>
 * Operation  - Runtime
 * --------------------
 * size       - O(1)
 * isEmpty    - O(1)
 * insert     - O(1)
 * min        - O(n)
 * removeMin  - O(n)
 */
public class UnsortedListPQ<K, V> extends AbstractPriorityQueue<K, V> {
    private int size;

    private LinkedList<Entry<K, V>> entries = new LinkedList<>();

    @Override
    public Entry<K, V> insert(K key, V value) {
        Entry<K, V> entry = new PQEntry<>(key, value);
        entries.add(entry);
        size++;
        return entry;
    }

    @Override
    public Entry<K, V> min() {
        if (entries.isEmpty()) {
            return null;
        }
        Entry<K, V> min = entries.getFirst();
        for (Entry<K, V> entry : entries) {
            if (compare(entry, min) < 0) {
                min = entry;
            }
        }
        return min;
    }

    @Override
    public Entry<K, V> removeMin() {
        Entry<K, V> min = min();
        entries.remove(min);
        size--;
        return min;
    }

    @Override
    public int size() {
        return size;
    }
}
