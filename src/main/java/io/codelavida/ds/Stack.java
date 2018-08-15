package io.codelavida.ds;

/**
 * A stack implements a collection that obeys the LIFO principle.
 *
 * @param <E>
 */
public interface Stack<E> extends Iterable<E> {
    /**
     * Inserts an element in to the stack.
     *
     * @param e the element to be inserted.
     */
    void push(E e);

    /**
     * @return the top of the stack after removing it.
     */
    E pop();

    /**
     * @return the top of the stack without removing it
     */
    E top();

    /**
     * @return true if the stack is empty
     */
    boolean isEmpty();

    /**
     * @return number of elements in the stack
     */
    int size();
}
