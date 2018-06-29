package io.codelavida.algorithm;

import java.util.Iterator;

/**
 * A simple implementation of a singly linked list
 *
 * @param <T>
 */
public class LinkedList<T> implements Iterable<T> {


    private class Node {
        T value;
        Node next;
    }

    private Node head;

    private int size;

    public int size() {
        return this.size;
    }


    public boolean isEmpty() {
        return this.size == 0;
    }

    public T first() {
        return head.value;
    }

    public void addFirst(T elem) {
        Node n = new Node();
        n.value = elem;
        n.next = head;
        head = n;
        this.size++;
    }

    public void addLast(T elem) {
        Node n = new Node();
        n.value = elem;
        head.next = n;
        head = n;
        this.size++;
    }

    public void removeFirst() {
        head = head.next;
        this.size--;
    }

    private class Iter<T> implements Iterator<T> {

        @Override
        public boolean hasNext() {
            return size != 0;
        }

        @Override
        public T next() {
            T val = (T) head.value;
            head = head.next;
            return val;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iter<>();
    }

}
