package io.codelavida.math;

import java.util.Arrays;
import java.util.Random;

/**
 * Use of array for vector and matrix operations.
 */
public final class ArrayMath {

    private static final Random rand = new Random();

    private ArrayMath() {
    }

    public static double median(double[] arr, int begin, int size) {
        int m = begin + (size - 1) / 2;
        if (size % 2 == 1) {
            return arr[m];
        } else {
            return (arr[m] + arr[m + 1]) / 2.0;
        }
    }

    public static double median(double[] arr) {
        return median(arr, 0, arr.length);
    }

    public static double sum(double[] nums, int low, int high) {
        if (low > high) return 0;
        if (low == high) return nums[low];
        else {
            int mid = (low + high) / 2;
            return sum(nums, low, mid) + sum(nums, mid + 1, high);
        }
    }

    public static double sum(double[] nums) {
        return sum(nums, 0, nums.length - 1);
    }

    public static double mean(double[] nums) {
        return (sum(nums) * 1.0) / nums.length;
    }

    public static double max(double[] nums, int begin, int size) {
        int end = begin + size;
        double m = Integer.MIN_VALUE;
        for (int i = begin; i < end; i++) {
            if (nums[i] > m) m = nums[i];
        }
        return m;
    }

    public static double max(double[] nums) {
        return max(nums, 0, nums.length);
    }

    public static double[] exp(final double input[]) {
        if (input == null) return null;
        double[] result = Arrays.copyOf(input, input.length);
        for (int i = 0; i < input.length; i++) {
            result[i] = Math.exp(input[i]);
        }
        return result;
    }

    public static double[] log(final double[] input) {
        if (input == null) return null;
        double[] result = Arrays.copyOf(input, input.length);
        for (int i = 0; i < input.length; i++) {
            result[i] = Math.log(input[i]);
        }
        return result;
    }

    public static double[] add(final double[] input, double x) {
        if (input == null) return null;
        double[] result = Arrays.copyOf(input, input.length);
        for (int i = 0; i < input.length; i++) {
            result[i] = input[i] + x;
        }

        return result;
    }

    public static double[] multiply(final double[] input, double x) {
        if (input == null) return null;
        double[] result = Arrays.copyOf(input, input.length);
        for (int i = 0; i < input.length; i++) {
            result[i] = input[i] * x;
        }

        return result;
    }

    public static double[] divide(final double[] input, double x) {
        if (input == null) return null;
        if (x == 0.0) throw new IllegalArgumentException("x must be non zero");
        double[] result = Arrays.copyOf(input, input.length);
        for (int i = 0; i < input.length; i++) {
            result[i] = input[i] / x;
        }

        return result;
    }


    public static double[] softmax(final double[] input) {
        if (input == null) return null;

        double[] e = exp(input);
        return divide(e, sum(e));

    }

    public static double[] pow(double[] input, double n) {
        double[] result = Arrays.copyOf(input, input.length);
        for (int i = 0; i < input.length; i++) {
            result[i] = Math.pow(input[i], n);
        }

        return result;
    }

    public static double[] abs(double[] input) {
        double[] result = Arrays.copyOf(input, input.length);
        for (int i = 0; i < input.length; i++) {
            result[i] = Math.abs(input[i]);
        }

        return result;
    }
}
