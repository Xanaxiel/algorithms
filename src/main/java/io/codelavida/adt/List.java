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
        return this.size() == 0;
    }


    /*
     * Clear the list by removing all elements from it.
     */
    void clear();

    /**
     * get the element at index i
     *
     * @param i
     * @return E element at index i
     */
    E get(int i);

    /*
     * Replace the element at the index i with element
     */
    E set(int i, E element);

    /**
     * Add element at the beginning of the list
     *
     * @param element to be added
     */
    void add(E element);

    /*
     * Insert an element at the index i
     */
    void add(int i, E element);

    /*
     * Remove an element from the end of the list
     */
    E remove(int index);


}
