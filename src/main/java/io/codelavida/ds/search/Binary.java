package io.codelavida.ds.search;

public class Binary {

    private static int search(int[] arr, int elem, int start, int end) {
        if (start > end) return -1;
        int k = (start + end) / 2;
        if (elem == arr[k])
            return k;
        else if (elem > arr[k])
            return search(arr, elem, k + 1, end);
        else
            return search(arr, elem, 0, k - 1);
    }

    /**
     * Search if `elem` exists in `arr`
     *
     * @param arr input integer array, assume it's already sorted.
     * @return true if the element exists or false
     */

    public static int search(int[] arr, int elem) {
        return search(arr, elem, 0, arr.length - 1);
    }
}
