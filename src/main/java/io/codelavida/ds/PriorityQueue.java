package io.codelavida.ds;


import java.io.Serializable;

/**
 * An ADT for priority queue.
 * <p>
 * A priority queue maintains a partial ordering of its elements such that
 * the prioritised element is found in constant time. The operations to
 * push and pop an element from the queue is logarithmic while removing an
 * element is linear.
 * <p>
 * The implementations allow elements with same priority. When calling min()
 * or removeMin() in such cases the specific entry to be returned can be
 * arbitrary.
 *
 * @param <K> The key representing the priority of the element to be added
 * @param <V> The value which can be the actual element
 */
public interface PriorityQueue<K, V> extends Serializable {

    /**
     * Creates an entry with key and value in the priority queue.
     *
     * @param key   the key of the entry to be added.
     * @param value the value of the entry to be added.
     * @return Entry: an entry object
     */
    Entry<K, V> insert(K key, V value);

    /**
     * Returns the entry that has the lease priority
     *
     * @return the entry with the lease priority.
     */
    Entry<K, V> min();

    /**
     * Similar to min but also removes the entry from the priority queue.
     *
     * @return the entry with lease priority
     */
    Entry<K, V> removeMin();

    /**
     * Finds the number of entries in the priority queue.
     *
     * @return integer representing the number of elements in the queue.
     */
    int size();

    /**
     * Checks if the priority queue is empty or not.
     *
     * @return {@code true} if the queue is empty otherwise returns false.
     */
    boolean isEmpty();

}
