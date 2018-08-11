package io.codelavida.ds;


import java.io.Serializable;
import java.util.AbstractQueue;
import java.util.Comparator;
import java.util.Iterator;

/**
 * A priority queue maintains a partial ordering of its elements such that
 * the least element is found in constant time. The operations to push and
 * pop an element from the queue is logarithmic while removing an element is
 * linear
 *
 * @param <E> Type parameter of the element in the priority queue.
 */
public class PriorityQueue<E> extends AbstractQueue<E>
        implements Serializable {

    private static final long serialVersionUID = -4749305057305804111L;

    private static final int DEFAULT_INITIAL_CAPACITY = 10;

    /**
     * Priority queue represented as a balanced binary heap
     * two children of queue[n] are queue[2*n+1] and queue[2*n+2].
     */
    transient Object[] queue;

    private final Comparator<? extends E> comparator;

    int size;

    public PriorityQueue() {
        this(null, DEFAULT_INITIAL_CAPACITY);
    }

    public PriorityQueue(Comparator<? extends E> comparator) {
        this(comparator, DEFAULT_INITIAL_CAPACITY);
    }

    public PriorityQueue(Comparator<? extends E> comparator, int initialCapacity) {
        this.comparator = comparator;
        queue = new Object[initialCapacity];
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }
}
