package io.codelavida.ds;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static com.google.common.truth.Truth.assertThat;

public class ListStackTest {

    private Stack<Integer> stack;

    @Before
    public void setUp() {
        stack = new ListStack<>();
    }

    @Test
    public void testEmptyStackSize() {
        assertThat(stack.isEmpty()).isTrue();
        assertThat(stack.size()).isEqualTo(0);
    }

    @Test(expected = EmptyStackException.class)
    public void testEmptyStackException() {
        stack.pop();
    }

    @Test
    public void testStackPush() {
        stack.push(10);
        assertThat(stack.size()).isEqualTo(1);
        assertThat(stack.pop()).isEqualTo(10);
    }

    @Test
    public void testStackPop() {
        stack.push(10);
        assertThat(stack.pop()).isEqualTo(10);
        assertThat(stack.size()).isEqualTo(0);
    }

    @Test
    public void testStackTop() {
        stack.push(10);
        assertThat(stack.top()).isEqualTo(10);
        assertThat(stack.size()).isEqualTo(1);
    }


}