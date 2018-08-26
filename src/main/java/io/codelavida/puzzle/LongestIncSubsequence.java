package io.codelavida.puzzle;

import java.util.Arrays;

public class LongestIncSubsequence implements Problem {
    @Override
    public String getName() {
        return "Longest Increasing Sub-sequence";
    }

    @Override
    public String getDescription() {
        return "You are given an integer array. Find the longest sub-sequences\n" +
                "of the array which has the elements in increasing order. B is\n" +
                "a sub-sequence of array A if B can be formed by removing some\n" +
                "elements from the array A without disturbing the order of\n" +
                "elements. For example {2,5,6,1,3} is the input array, Then\n" +
                "{2,5}, {2,6}, {2,6,1}, {2,1,3} are some of its sub-sequences.\n" +
                "In these {2,5}, {2,6} are increasing sub-sequences. The longest\n" +
                "sub-sequence is of length 3";
    }

    @Override
    public String getSolution() {
        return "Brute Force:\n" +
                "The number of sub-sequences is a set of size 2^n. So brute force" +
                " is to check all of the sub-sequences for increasing order and " +
                "then return the length of the longest one.\n" +
                "Dynamic Programming:\n" +
                "In this we will use memoization to solve the problem. At any\n" +
                "index i, the sub-problem is to find the longest sub-sequence\n" +
                "of the array until index i For i+1, we can reuse the results\n" +
                "from the previous sub-problem. The runtime complexity of this\n" +
                "problem is O(n*k) where n is the number of elements and k is the\n" +
                "number of increasing sub-sequences in the array which depends\n" +
                "on the original ordering of the array.";
    }

    /**
     * if we know the length of the LIS upto ithi^{th}i​th​​ index, we can
     * figure out the length of the LIS possible by including the (i+1)th
     * element based on the elements with indices j such that 0 ≤ j ≤ (i+1).
     * <p>
     * memo[i] represents the length of the longest increasing subsequence
     * possible considering the array elements up to the ith​​ index only, by
     * necessarily including the i​th​​ element.
     * <p>
     * dp[i] = max(dp[j])+1,∀0≤j<i
     *
     * @param nums input integers
     * @return max length of the increasing sub sequence.
     */
    static int lengthLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] memo = new int[nums.length];
        memo[0] = 1;
        int maxans = 1;
        for (int i = 1; i < nums.length; i++) {
            int maxval = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxval = Math.max(maxval, memo[j]);
                }
            }
            memo[i] = maxval + 1;
            maxans = Math.max(maxans, memo[i]);
        }
        return maxans;
    }

    static int lengthLISBinarySearch(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] memo = new int[nums.length];

        int length = 0;
        for (int num : nums) {
            int i = Arrays.binarySearch(memo, 0, length, num);
            if (i < 0) {
                i = -(i + 1);
            }
            memo[i] = num;
            if (i == length) {
                length++;
            }
        }

        return length;
    }
}
