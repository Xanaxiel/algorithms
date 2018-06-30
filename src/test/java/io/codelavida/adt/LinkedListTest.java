package io.codelavida.adt;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LinkedListTest {

    @Test
    public void testEmptyList() {
        LinkedList<String> strings = new LinkedList<>();
        assertTrue(strings.isEmpty());
    }

    @Test
    public void testAddElement() {
        LinkedList<String> strings = new LinkedList<>();
        strings.addFirst("Hello");
        strings.addFirst("World");
        assertEquals(2, strings.size());
    }

    @Test
    public void testRemove() {
        LinkedList<String> strings = new LinkedList<>();
        strings.addFirst("Hello");
        strings.addFirst("World");
        strings.removeFirst();
        assertEquals("Hello", strings.first());
    }
}