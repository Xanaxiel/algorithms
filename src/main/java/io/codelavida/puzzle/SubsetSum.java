package io.codelavida.puzzle;

import java.util.Arrays;
import java.util.Scanner;

public class SubsetSum implements Problem {
    @Override
    public String getName() {
        return "Subset Sum";
    }

    @Override
    public String getDescription() {
        return "Given a set of non-negative integers,\n" +
                "and a value sum, determine if there is a subset of the\n" +
                "given set with sum equal to given sum.\n" +
                "Solution using dynamic programming.";
    }

    @Override
    public String getSolution() {
        return "";
    }

    public static boolean splitArraySameAverage(int[] arr) {
        int n = arr.length;
        int sum = Arrays.stream(arr).sum();
        for (int i = 1; i <= n / 2; ++i) {
            if (sum * i % n == 0 && isSubsetSum(arr, n, (sum * i) / n)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSubsetSum(int[] arr, int n, int sum) {
        //base cases
        if (sum == 0) return true;
        if (n == 0) return false;

        // if last element is greater than sum, then ignore it
        if (arr[n - 1] > sum) return isSubsetSum(arr, n - 1, sum);

        return isSubsetSum(arr, n - 1, sum) ||
                isSubsetSum(arr, n - 1, sum - arr[n - 1]);

    }

}
