package io.codelavida.puzzle;


class CountDigit {

    /**
     * Given an integer X within the range of 0 to 9, and given
     * two positive integers as upper and lower bounds respectively,
     * find the number of times X occurs as a digit in an integer
     * within the range, excluding the bounds. Print the frequency
     * of occurrence as output.
     *
     * @param x    the digit whose frequency to be calculated
     * @param low  the lower bound
     * @param high the upper bound
     * @return number of times x appears as a digit in a number between
     * low and high (exclusive)
     */
    static int numDigitX(int x, int low, int high) {
        int count = 0;
        for (int i = low + 1; i < high; i++) {
            int j = i;
            while (j != 0) {
                if (j % 10 == x) count++;
                j = j / 10;
            }
        }
        return count;
    }
}
