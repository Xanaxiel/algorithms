package io.codelavida.ds;

/**
 * An API to the Queue data type. Queues are FIFO data structures.
 */
public interface Queue<E> extends Iterable<E> {

    /**
     * Enqueues an element in the queue.
     *
     * @param elem an item of type T
     */
    void enqueue(E elem);

    /**
     * De-queues an element from the front of the queue
     *
     * @return the dequeued item.
     */
    E dequeue();

    /**
     * Checks if the queue is empty
     *
     * @return true if the queue is empty
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in the queue
     *
     * @return current size of the queue
     */
    int size();


}
