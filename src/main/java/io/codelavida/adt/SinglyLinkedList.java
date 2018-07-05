package io.codelavida.adt;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;


/**
 * Single linked list implementation.
 * <p>
 * Elements are added at the tail of the list.
 *
 * @param <E>
 */
public class SinglyLinkedList<E> implements List<E> {

    private int size = 0;

    private class Node {
        private Node next;
        private E element;

        Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }
    }

    private Node head;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {

    }

    private E get(Node node, int n) {
        for (int i = 0; i < n; i++) {
            node = node.next;
        }
        return node.element;
    }

    @Override
    public E get(int i) {
        return get(head, i);
    }

    @Override
    public E set(int i, E element) {
        return null;
    }

    private void add(Node n, E e) {
        if (n.next == null) {
            n.next = new Node(e, null);
        } else {
            add(n.next, e);
        }
    }

    @Override
    public void add(E element) {
        if (head == null) {
            head = new Node(element, null);
        } else {
            add(head, element);
        }
        this.size++;

    }

    @Override
    public void add(int i, E element) {
        Node cur = head;
        if (i >= size) return;
        while (i-- > 0) {
            cur = cur.next;
        }
    }

    @Override
    public E remove(int i) {
        if (head == null || i >= size) return null;
        Node prev = head;
        if (i == 0) {
            E e = head.element;
            head = head.next;
            return e;
        }
        //Go to the prev of the element to be deleted
        for (int j = 0; j < i - 1; j++) {
            prev = prev.next;
        }
        E e = prev.next.element;
        prev.next = prev.next.next;
        return e;
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
