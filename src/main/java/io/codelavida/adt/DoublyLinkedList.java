package io.codelavida.adt;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * An implementation of a doubly linked list
 *
 * @param <E>
 */
public class DoublyLinkedList<E> implements List<E> {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public void insert(int i, E element) {

    }

    @Override
    public void append(E element) {

    }

    @Override
    public E remove() {
        return null;
    }


    private class Iter<T> implements Iterator<T> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iter<>();
    }

    @Override
    public void forEach(Consumer<? super E> action) {

    }

    @Override
    public Spliterator<E> spliterator() {
        return null;
    }

}
