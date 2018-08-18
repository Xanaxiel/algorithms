package io.codelavida.ds;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class SinglyLinkedListTest {

    @Test
    public void testCreateEmptyList() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testAddElement() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(10);
        assertEquals(1, list.size());
        assertEquals(Integer.valueOf(10), list.get(0));
    }

    @Test
    public void testGetElementByValidIndex() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(100);
        assertEquals(Integer.valueOf(100), list.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetElementByInvalidIndex() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(100);
        list.get(2);
    }

    @Test
    public void testSearchExistingElement() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(100);
        assertTrue(list.contains(100));
        assertFalse(list.contains(200));
    }

    @Test
    public void testRemoveElement() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        assertEquals(Integer.valueOf(200), list.remove(1));
        assertEquals(Integer.valueOf(300), list.get(1));
    }
}