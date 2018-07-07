package io.codelavida.ds.list;

import io.codelavida.ds.List;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Array based list implementation
 */
public class ArrayList<E> implements List<E> {

    private static final int CAPACITY = 20;

    private E[] data;

    private int size = 0;

    /**
     * Dynamically resize array
     *
     * @param capacity new capacity
     */
    private void resize(int capacity) {
        E[] temp = (E[]) new Object[capacity];
        for (int k = 0; k < size; k++) {
            temp[k] = data[k];
        }
        data = temp;
    }


    public ArrayList() {
        this(CAPACITY);
    }

    public ArrayList(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int i) {
        checkIndex(i, size);
        return data[i];
    }

    @Override
    public E set(int i, E element) {
        checkIndex(i, size);
        E temp = data[i];
        data[i] = element;
        return temp;

    }

    private void checkIndex(int i, int n) {
        if (i < 0 || i >= n) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public void add(E element) {
        add(0, element);
    }

    @Override
    public void add(int i, E element) {
        checkIndex(i, size + 1);
        if (size == data.length) {
            resize(2 * size);
        }
        for (int k = size - 1; k >= 1; k--) {
            data[k + 1] = data[k];
        }
        data[i] = element;
        size++;
    }

    @Override
    public E remove(int i) {
        checkIndex(i, size);
        E temp = data[i];
        for (int k = i; k < size - 1; k++) {
            data[k] = data[k + 1];
        }
        data[size - 1] = null;
        size--;
        return temp;
    }


    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super E> action) {

    }

    @Override
    public Spliterator<E> spliterator() {
        return null;
    }
}
