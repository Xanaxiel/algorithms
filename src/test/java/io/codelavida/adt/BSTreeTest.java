package io.codelavida.adt;

import org.junit.Test;

import static org.junit.Assert.*;

public class BSTreeTest {


    @Test
    public void testBstSize() {
        BSTree<String, String> bsTree = new BSTree<>();
        assertEquals(0, bsTree.size());
        bsTree.put("Fruit", "Apple");
        assertEquals(1, bsTree.size());
    }


    @Test
    public void testBstSearch() {
        BSTree<String, String> bsTree = new BSTree<>();
        bsTree.put("Fruit", "Apple");
        bsTree.put("Drink", "Juice");
        bsTree.put("Desert", "Cake");
        assertEquals("Juice", bsTree.get("Drink"));
    }

}