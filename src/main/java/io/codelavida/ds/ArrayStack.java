package io.codelavida.ds;

import java.util.Iterator;

public class ArrayStack<E> implements Stack<E> {

    private static final int CAPACITY = 100;

    E[] data;

    int top = -1;

    public ArrayStack() {
        this(CAPACITY);
    }

    /**
     * Fixed capacity stack
     *
     * @param capacity initial capacity of the stack
     */
    public ArrayStack(int capacity) {
        this.data = (E[]) new Object[capacity];
    }

    @Override
    public void push(E e) {
        top = top + 1;
        if (top == data.length) {
            data = (E[]) ArrayUtil.resize(data);
        }
        data[top] = e;
    }

    @Override
    public E pop() {
        if (isEmpty()) return null;
        E e = data[top];
        data[top] = null;
        top = top - 1;
        return e;
    }

    @Override
    public E top() {
        if (isEmpty()) return null;
        return data[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
