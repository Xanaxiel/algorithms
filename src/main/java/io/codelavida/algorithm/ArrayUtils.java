package io.codelavida.algorithm;

/**
 * A collection of algorithms implemented on integer arrays.
 */
public final class ArrayUtils {

    private ArrayUtils() {
    }

    /**
     * takes an array of integers
     *
     * @return index of the largest element in the array
     */
    public static int max(int[] nums) throws IllegalAccessException {
        if (nums.length == 0) {
            throw new IllegalAccessException("Array must be non-empty");
        }
        int m = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > m) m = num;
        }
        return m;
    }

    /**
     * Checks if an array of integers is sorted in non-decreasing order
     *
     * @param arr input array
     * @return true if the array is sorted or false
     */
    public static boolean isSorted(int[] arr) {
        for (int i = 0, j = 1; i < arr.length - 1; i++, j++) {
            if (arr[i] > arr[j]) {
                return false;
            }
        }
        return true;
    }

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
    public static void insertionSort(int[] arr) {
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

    private static int binarySearch(int[] arr, int elem, int start, int end) {
        if (start > end) return -1;
        int k = (start + end) / 2;
        if (elem == arr[k])
            return k;
        else if (elem > arr[k])
            return binarySearch(arr, elem, k + 1, end);
        else
            return binarySearch(arr, elem, 0, k - 1);
    }

    /**
     * Search if `elem` exists in `arr`
     *
     * @param arr input integer array, assume it's already sorted.
     * @return true if the element exists or false
     */

    public static int binarySearch(int[] arr, int elem) {
        return binarySearch(arr, elem, 0, arr.length - 1);
    }

}
