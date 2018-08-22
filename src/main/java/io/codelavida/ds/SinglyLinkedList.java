package io.codelavida.ds;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * A class representing a singly linked list. It doesn't allow nulls.
 *
 * @param <E>
 */
public class SinglyLinkedList<E> implements List<E> {

    private int size = 0;

    private Node<E> head;

    private static class Node<E> {
        private Node<E> next;
        private E value;

        Node(E value) {
            this.value = value;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public boolean add(E e) {
        if (e == null) return false;
        add(size, e);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return o != null && remove(indexOf(o)) != null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean addAll(Collection<? extends E> c) {
        E[] coll = (E[]) c.toArray();
        for (E elem : coll) {
            if (!add(elem)) return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        E[] coll = (E[]) c.toArray();
        for (int i = coll.length; i >= 0; i--) {
            add(index, coll[i]);
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean removeAll(Collection<?> c) {
        E[] coll = (E[]) c.toArray();
        for (E elem : coll) {
            if (!remove(elem)) return false;
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        Node<E> prev;
        while (head != null) {
            prev = head;
            head = head.next;
            prev.next = null;
            size--;
        }
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        int i = index;
        Node<E> ref = head;
        while (ref.next != null && i-- > 0) {
            ref = ref.next;
        }
        return ref.value;
    }

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        int i = 0;
        Node<E> ref = head;
        while (i++ < index) {
            ref = ref.next;
        }
        E old = ref.value;
        ref.value = element;
        return old;
    }

    @Override
    public void add(int index, E element) {
        checkIndex(index);
        Node<E> node = new Node<>(element);
        if (head == null) {
            head = node;
        } else {
            int i = 0;
            Node<E> prev = head;
            while (i++ < index - 1) {
                prev = prev.next;
            }
            node.next = prev.next;
            prev.next = node;
        }
        size++;
    }


    @Override
    public E remove(int index) {
        checkIndex(index);
        Node<E> prev = head;
        if (index == 0) {
            head = head.next;
        } else {
            int i = 0;
            while (i++ < index - 1) {
                prev = prev.next;
            }

        }
        E rem = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return rem;
    }

    @Override
    public int indexOf(Object o) {
        int i = 0;
        Node<E> ref = head;
        while (ref != null) {
            if (ref.value.equals(o)) {
                return i;
            }
            i++;
            ref = ref.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int i = -1;
        int j = -1;
        Node<E> ref = head;
        while (ref.next != null) {
            i++;
            if (ref.value.equals(o)) {
                j = i;
            }
            ref = ref.next;
        }
        return j;
    }

    /**
     * Reverses the list and returns the reference to the head of the list.
     */
    public void reverse() {
        if (isEmpty())
            return;
        reverse(head, head.next);
    }

    private void reverse(Node<E> prev, Node<E> curr) {
        if (curr == null) {
            head = prev;
            return;
        }
        Node<E> next = curr.next;
        curr.next = prev;
        reverse(curr, next);
    }


    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
