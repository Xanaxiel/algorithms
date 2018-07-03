package io.codelavida;

import java.util.Random;

/**
 * Collection of utility functions
 */
public final class Util {

    private static Random generator = new java.util.Random();

    private Util() {

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
     * Checks if an array of reference types is sorted in non-decreasing order.
     * The class must implement the Comparable interface.
     *
     * @param arr input array of objects
     * @return true if the array is sorted or false
     */
    public static boolean isSorted(Comparable[] arr) {
        for (int i = 0, j = 1; i < arr.length - 1; i++, j++) {
            if (arr[i].compareTo(arr[j]) > 0) {
                return false;
            }
        }
        return true;
    }


    public static void exchange(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void exchange(Comparable[] arr, int i, int j) {
        Comparable t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }


    public static double median(int[] arr, int begin, int size) {
        int m = begin + (size - 1) / 2;
        // odd
        if (size % 2 == 1) {
            return arr[m];
        } else {
            // even then (arr[n/2 - 1] + arr[n/2])/2.0
            return (arr[m] + arr[m + 1]) / 2.0;
        }
    }


    public static double median(int[] arr) {
        return median(arr, 0, arr.length);
    }


    public static int[] getRandomArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = generator.nextInt(length);
        }
        return arr;
    }

    public static int sum(int[] nums, int low, int high) {
        if (low > high) return 0;            // zero elements in the array
        if (low == high) return nums[low];   // one element in the array
        else {
            int mid = (low + high) / 2;
            return sum(nums, low, mid) + sum(nums, mid + 1, high);
        }
    }

    public static int sum(int[] nums) {
        return sum(nums, 0, nums.length - 1);
    }

    public static double avg(int[] nums) {
        return (sum(nums) * 1.0) / nums.length;
    }

    public static int max(int[] nums, int begin, int size) {
        int end = begin + size;
        int m = Integer.MIN_VALUE;
        for (int i = begin; i < end; i++) {
            if (nums[i] > m) m = nums[i];
        }
        return m;
    }

    /**
     * Finds the largest element in an array of integers.
     *
     * @return index of the largest element in the array
     */
    public static int max(int[] nums) {
        return max(nums, 0, nums.length);
    }

    public static class Stopwatch {

        private long start, end;

        public void start() {
            this.start = System.currentTimeMillis();
        }

        public void stop() {
            this.end = System.currentTimeMillis();
        }

        public String duration() {
            return String.format("%8.4f Seconds", (end - start) / 1000.0);
        }

    }

}
