package io.codelavida;

import java.util.Random;

public class Util {
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


    private static Random generator = new java.util.Random();

    public static int[] getRandomArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = generator.nextInt(length);
        }
        return arr;
    }

    public static int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static double avg(int[] nums) {
        return (sum(nums) * 1.0) / nums.length;
    }

    /**
     * takes an array of integers
     *
     * @return index of the largest element in the array
     */
    public static int max(int[] nums) {
        int m = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > m) m = num;
        }
        return m;
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
