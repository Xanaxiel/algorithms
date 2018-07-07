package io.codelavida.ds.sort;

public class Insertion {

    /**
     * Insertion sort implementation. For visualization, let's say we
     * process the array in left to right order. Starting from the second
     * element compare `it` with all the elements on its left. Every time
     * we find an element j that is greater than `it`, we slide all elements
     * one position to the right starting from j to `it`'s position. Then we
     * slot `it` at the position j.
     *
     * @param arr original array that will be sorted in increasing order.
     */
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int cur = arr[i];
            int j = i;
            while (j > 0 && cur < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = cur;
        }
    }

    public static void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Comparable cur = arr[i];
            int j = i;
            while (j > 0 && cur.compareTo(arr[j - 1]) < 0) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = cur;
        }
    }
}
