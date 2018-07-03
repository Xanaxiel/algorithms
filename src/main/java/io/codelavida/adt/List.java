package io.codelavida.adt;

/**
 * The List ADT. It is generic in type parameter E.
 */
public interface List<E> extends Iterable<E> {

    /*
     * Returns the number of elements in the list
     */
    int size();

    /*
     * Returns true if the list is empty
     */
    default boolean isEmpty() {
        return size() == 0;
    }


    /*
     * Clear the list by removing all elements from it.
     */
    void clear();

    /*
     * Insert an element at the index i
     */
    void insert(int i, E element);

    /*
     * Append an element to the end of the list
     */
    void append(E element);

    /*
     * Remove an element from the end of the list
     */
    E remove();

}
