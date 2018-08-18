package io.codelavida.ds;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class MinHeapPQTest {

    @Test
    public void shouldCreateNewEmptyPQ() {
        PriorityQueue<Integer, String> pq = new MinHeapPQ<>();
        assertTrue(pq.isEmpty());
        assertEquals(0, pq.size());
    }

    @Test
    public void shouldInsertNewElementsInPQ() {
        PriorityQueue<Integer, String> pq = new MinHeapPQ<>();
        pq.insert(1, "Task1");
        pq.insert(2, "Task2");
        assertEquals(2, pq.size());
    }

    @Test
    public void shouldReturnMinPriorityElementInPQ() {
        PriorityQueue<Integer, String> pq = new MinHeapPQ<>();
        pq.insert(1, "Task1");
        pq.insert(2, "Task2");
        assertEquals("Task1", pq.min().getValue());
        assertEquals(2, pq.size());
    }

    @Test
    public void shouldRemoveMinPriorityElementInPQ() {
        PriorityQueue<Integer, String> pq = new MinHeapPQ<>();
        pq.insert(1, "Task1");
        pq.insert(2, "Task2");
        assertEquals("Task1", pq.removeMin().getValue());
        assertEquals(1, pq.size());
    }

}