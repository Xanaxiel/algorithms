package io.codelavida.algorithm;

public final class ArrayUtils {

    private ArrayUtils(){}

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
}
