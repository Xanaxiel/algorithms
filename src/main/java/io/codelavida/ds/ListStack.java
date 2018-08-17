package io.codelavida.ds;

import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * A linked list implementation of the {@link io.codelavida.ds.Stack} interface.
 */
public class ListStack<E> implements Stack<E> {
    private int size;

    private static class Node<E> {
        private Node<E> next;
        private E value;

        Node(E value) {
            this.value = value;
        }
    }

    private Node<E> top;

    @Override
    public void push(E e) {
        if (top == null) {
            top = new Node<>(e);
        } else {
            Node<E> next = top;
            top = new Node<>(e);
            top.next = next;
        }
        size++;
    }

    @Override
    public E pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        Node<E> pop = top;
        top = top.next;
        size--;
        return pop.value;
    }

    @Override
    public E top() {
        return top.value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new StackIterator<E>();
    }

    private class StackIterator<E> implements Iterator<E> {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }
}
