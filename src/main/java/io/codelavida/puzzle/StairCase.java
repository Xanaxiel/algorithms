package io.codelavida.puzzle;

import java.util.Arrays;

/**
 * There exists a staircase with N steps, and you can climb up either 1 or 2
 * steps at a time. Given N, write a function that returns the number of
 * unique ways you can climb the staircase. The order of the steps matters.
 * <p>
 * For example, if N is 4, then there are 5 unique ways:
 * <pre>
 *      1, 1, 1, 1
 *      2, 1, 1
 *      1, 2, 1
 *      1, 1, 2
 *      2, 2
 * </pre>
 * What if, instead of being able to climb 1 or 2 steps at a time, you could
 * climb any number from a set of positive integers X? For example,
 * if X ={1, 3, 5}, you could climb 1, 3, or 5 steps at a time.
 */
public class StairCase {

    public static int uniqueWays(int n, int[] x) {
        int[] memo = new int[n + 1];
        return uniqueWays(n, memo, x);
    }

    private static int uniqueWays(int n, int[] memo, int[] steps) {
        if (n < 0) {
            return 0;
        }

        if (n == 0) {
            return 1;
        }

        if (memo[n] == 0) {
            for (int s : steps) {
                memo[n] += uniqueWays(n - s, memo, steps);
            }
        }

        return memo[n];

    }

    public static void main(String[] args) {
        System.out.println(uniqueWays(10, new int[]{1, 2, 3}));
    }
}
