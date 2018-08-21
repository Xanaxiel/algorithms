package io.codelavida.puzzle;

import java.util.Arrays;

public class SubsetSum implements Problem {
    @Override
    public String getName() {
        return "Subset Sum";
    }

    @Override
    public String getDescription() {
        return "Given a set of non-negative integers, and a value sum, determine\n" +
                "if there is a subset of the given set with sum equal to given sum.";
    }

    @Override
    public String getSolution() {
        return "We solve this using dynamic programming using recursion and " +
                "loops.";
    }

    static boolean splitArraySameAverage(int[] arr) {
        int n = arr.length;
        int sum = Arrays.stream(arr).sum();
        for (int i = 1; i <= n / 2; ++i) {
            if (sum * i % n == 0
                    && isSubsetSum(arr, (sum * i) / n)) {
                return true;
            }
        }
        return false;
    }

    static boolean isSubsetSumRecursive(int[] arr, int k) {
        Boolean[][] memo = new Boolean[arr.length + 1][k + 1];
        return isSubsetSumRecursive(arr, 0, k, memo);
    }


    private static Boolean isSubsetSumRecursive(int[] arr, int i, int k,
                                                Boolean[][] memo) {

        if (memo[i][k] != null) {
            return memo[i][k];
        }

        if (i == arr.length - 1) {
            return arr[i] == k || k == 0;
        }

        if (arr[i] > k) {
            memo[i][k] = isSubsetSumRecursive(arr, i + 1, k, memo);
            return memo[i][k];
        }

        memo[i][k] = isSubsetSumRecursive(arr, i + 1, k, memo) ||
                isSubsetSumRecursive(arr, i + 1, k - arr[i], memo);

        return memo[i][k];

    }

    static boolean isSubsetSum(int[] arr, int k) {
        boolean[][] memo = new boolean[arr.length + 1][k + 1];
        for (int i = 1; i <= arr.length; i++) {
            for (int s = 1; s <= k; s++) {
                if (s == arr[i - 1]) {
                    memo[i][s] = true;
                } else if (s > arr[i - 1]) {
                    memo[i][s] = memo[i - 1][s] || memo[i - 1][s - arr[i - 1]];
                } else {
                    memo[i][s] = memo[i - 1][s];
                }
            }
        }
        return memo[arr.length][k];
    }

}
