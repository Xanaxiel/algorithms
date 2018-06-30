package io.codelavida.algorithm.sort;

import static io.codelavida.Util.exchange;

/**
 * Find the smallest item in the array and exchange
 * it with the first entry. Then, find the next
 * smallest item and exchange it with the second entry.
 * Continue in this way until the entire array is sorted.
 */
public class Selection {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    exchange(arr, i, j);
                }
            }
        }
    }

    public static void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[i]) < 0) {
                    exchange(arr, i, j);
                }
            }
        }
    }
}
