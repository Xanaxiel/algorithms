package io.codelavida.adt;

import org.junit.Test;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {

    @Test
    public void testCreateEmptyList() {
        List<Integer> list = new SinglyLinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testAddElement() {
        List<Integer> list = new SinglyLinkedList<>();
        list.add(10);
        assertEquals(1, list.size());
    }

    @Test
    public void testGetElement() {
        List<Integer> list = new SinglyLinkedList<>();
        list.add(100);
        assertEquals(Integer.valueOf(100), list.get(0));
    }

    @Test
    public void testRemoveElement() {
        List<Integer> list = new SinglyLinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        assertEquals(Integer.valueOf(200), list.remove(1));
        assertEquals(Integer.valueOf(300), list.get(1));
    }
}