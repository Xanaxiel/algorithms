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

    private static Random generator = new java.util.Random();

    public static int[] getRandomArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = generator.nextInt(100);
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


}
