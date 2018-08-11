package io.codelavida.puzzle;

public final class Spoj {
    private Spoj() {
    }

    /**
     * https://www.spoj.com/problems/RANGEZER/
     * <p>
     * given two integers a and b. Find the number of zeroes in the digits of
     * all the numbers in the range [a,b] inclusive.
     *
     * @param a first integer
     * @param b second integer
     * @return number of zeroes in the digits.
     */
    public static int zerosInRange(int a, int b) {
        if (a > b) {
            throw new IllegalArgumentException("a must be smaller or equal to b");
        }
        int numZeros = 0;
        if (a <= 0) numZeros++;
        for (int i = a; i <= b; i++) {
            int n = i;
            while (n > 0) {
                if (n % 10 == 0) numZeros++;
                n = n / 10;
            }
        }
        return numZeros;
    }

}
