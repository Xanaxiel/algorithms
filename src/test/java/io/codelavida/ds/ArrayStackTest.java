package io.codelavida.ds;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayStackTest {

    @Test
    public void testEmptyStack() {
        Stack<Integer> stack = new ArrayStack<>(10);
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

    @Test
    public void testStackPush() {
        Stack<Integer> stack = new ArrayStack<>(10);
        Integer e = 100;
        stack.push(e);
        assertEquals(1, stack.size());
        assertEquals(e, stack.top());
    }

    @Test
    public void testStackPushNoOverflow() {
        Stack<Integer> stack = new ArrayStack<>(2);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(3, stack.size());
    }

    @Test
    public void testStackPop() {
        Stack<Integer> stack = new ArrayStack<>(10);
        stack.push(100);
        Integer e = stack.pop();
        assertEquals(Integer.valueOf(100), e);
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testStackTop() {
        Stack<Integer> stack = new ArrayStack<>(10);
        stack.push(100);
        Integer e = stack.top();
        assertEquals(Integer.valueOf(100), e);
        assertFalse(stack.isEmpty());
    }
}