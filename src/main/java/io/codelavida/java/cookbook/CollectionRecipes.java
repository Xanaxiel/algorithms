package io.codelavida.java.cookbook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * A mixtures of collection recipes
 */
public final class CollectionRecipes {

    public static void main(String[] args) {
        /*
         *  Lists:
         *   - Are ordered collection of elements of the same type.
         *   - Users can operate elements based on their positions.
         *   - Duplicate elements are allowed in lists.
         *   - May allow nulls
         */

        /*
         * ArrayList:
         *   - Resizable array based list implementation
         *   - Allows nulls
         */
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(10);
        aList.add(20);
        aList.add(30);

        System.out.println("CONSTANT TIME OPERATIONS -");
        System.out.println("Size of the list:" + aList.size());
        System.out.println("IsEmpty:" + aList.isEmpty());
        System.out.println("Get element at index i, e.g. i=2:" + aList.get(2));
        System.out.println("Set element at index i, e.g. i=1:" + aList.set(1, 25));

        System.out.println("AMORTIZED CONSTANT TIME OPERATIONS - i.e., adding n elements requires O(n) time");
        System.out.println("Add an element to the list:" + aList.add(50));

        System.out.println("LINEAR TIME OPERATIONS - ");
        System.out.println("Remove an element in the list at index i:" + aList.remove(1));
        System.out.println("Search for an element in the list:" + aList.indexOf(30));
        System.out.println("As an array:" + Arrays.toString(aList.toArray()));

        /*
         * LinkedList:
         *   - Doubly linked list based list implementation
         *   - Allows nulls
         */
        LinkedList<Integer> lList = new LinkedList<>();
        lList.add(10);
        lList.add(20);
        lList.add(30);

        System.out.println("CONSTANT TIME OPERATIONS -");
        System.out.println("Size of the list:" + lList.size());
        System.out.println("Add an element to the end of the list:" + lList.add(50));
        System.out.println("Add an element to the start of the list:");
        lList.addFirst(50);

        System.out.println("AMORTIZED CONSTANT TIME OPERATIONS - i.e., adding n elements requires O(n) time");

        System.out.println("LINEAR TIME OPERATIONS - ");
        System.out.println("Get element at index i, e.g. i=2:" + lList.get(2));
        System.out.println("Set element at index i, e.g. i=1:" + lList.set(1, 25));
        System.out.println("Search for an element in the list:" + lList.indexOf(30));

        /*
         * Set:
         *  - A collection that doesn't allow duplicates.
         *
         * SortedSet:
         *  - In addition to the properties of a set it also provides ordering
         */


    }
}
