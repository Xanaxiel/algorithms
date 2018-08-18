package io.codelavida.ds;


import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ArrayList<E> implements List<E> {
    private static final int CAPACITY = 100;
    private int numElements;
    private E[] data;

    ArrayList() {
        data = (E[]) new Object[CAPACITY];
    }

    @Override
    public int size() {
        return numElements;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < numElements; i++) {
            if (data[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] copy = Arrays.copyOf(data, numElements);
        return copy;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        try {
            if (numElements == data.length) {
                this.data = (E[]) ArrayUtil.resize(data);
            }
            this.data[numElements++] = e;
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int i = indexOf(o);
        if (i == -1) return false;
        remove(i);
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        Object[] elements = c.toArray();
        for (Object e : elements) {
            if (!contains(e)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean success = true;
        Object[] elements = c.toArray();
        for (Object e : elements) {
            success = add((E) e);
        }
        return success;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        boolean success = true;
        int j = index;
        Object[] elements = c.toArray();
        for (Object e : elements) {
            add(j++, (E) e);
        }
        return success;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        if (index >= data.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return data[index];
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= numElements) {
            throw new IllegalArgumentException("Invalid index position");
        }
        E old = data[index];
        data[index] = element;
        return old;
    }

    @Override
    public void add(int index, E element) {
        if (index < 0 || index >= numElements) {
            throw new IllegalArgumentException("Invalid index position");
        }

        int j = index + 1;

        if (j >= data.length) {
            data = (E[]) ArrayUtil.resize(data);
        }

        while (j-- >= index) {
            data[j] = data[j - 1];
        }

        this.data[index] = element;

        numElements++;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= numElements) {
            throw new IllegalArgumentException("Invalid index position");
        }
        E element = data[index];

        int j = index;

        while (j++ < numElements) {
            data[j] = data[j + 1];
        }

        numElements--;

        return element;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < numElements; i++) {
            if (data[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = -1;
        for (int i = 0; i < numElements; i++) {
            if (data[i].equals(o)) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return new Itr(index);
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    private class Itr implements ListIterator<E> {
        int next;  //next element
        int prev = -1;

        Itr(int i) {
            next = i;
        }

        @Override
        public boolean hasNext() {
            return next != size();
        }

        @Override
        public E next() {
            if (next >= size()) {
                throw new NoSuchElementException();
            }

            E e = data[next];
            next++;
            prev++;
            return e;
        }

        @Override
        public boolean hasPrevious() {
            return prev > 0;
        }

        @Override
        public E previous() {
            if (prev < 0) {
                throw new NoSuchElementException();
            }
            E e = data[prev];
            next--;
            prev--;
            return e;
        }

        @Override
        public int nextIndex() {
            return next;
        }

        @Override
        public int previousIndex() {
            return prev;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(E e) {

        }

        @Override
        public void add(E e) {

        }
    }
}
