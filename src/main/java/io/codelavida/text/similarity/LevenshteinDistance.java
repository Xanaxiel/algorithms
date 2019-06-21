package io.codelavida.text.similarity;


/**
 * Implements the algorithm to calculate the Levenshtein distance between
 * two character strings.
 * <p>
 * It calculates the number of edits required to convert one sequence to
 * the other, where each change is a single character modification (insert,
 * substitute or delete)
 */
public class LevenshteinDistance implements EditDistance<Integer> {


    /**
     * Default instance
     */
    private static final LevenshteinDistance DEFAULT_INSTANCE = new LevenshteinDistance();


    /**
     * @return default instance of this class
     */
    public static LevenshteinDistance getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /**
     * Calculate and return the Levenshtein distance between two character
     * sequences.
     *
     * @param left  the first string, must be not null
     * @param right the second string, must be not null
     * @return integer representing the Levenshtein distance.
     * @throws IllegalArgumentException if any of the two character sequences is null.
     */
    @Override
    public Integer apply(CharSequence left, CharSequence right) {
        if (left == null || right == null) {
            throw new IllegalArgumentException("Both parameters must be not null");
        }

        int m = left.length(), n = right.length();

        if (m == 0) {
            return n;
        } else if (n == 0) {
            return m;
        }

        // we want the first string to be smaller
        if (m > n) {
            CharSequence tmp = left;
            left = right;
            right = tmp;
            m = n;
            n = right.length();
        }

        final int[] p = new int[m + 1];

        int i, j;
        int upper, upperLeft;
        char rightJ;

        int cost;

        for (i = 0; i <= m; i++) {
            p[i] = i;
        }

        for (j = 1; j <= n; j++) {
            upperLeft = p[0];
            rightJ = right.charAt(j - 1);
            p[0] = j;

            for (i = 1; i <= m; i++) {
                upper = p[i];
                cost = left.charAt(i - 1) == rightJ ? 0 : 1;
                p[i] = Math.min(Math.min(p[i - 1] + 1, p[i] + 1), upperLeft + cost);
                upperLeft = upper;
            }
        }

        return p[m];
    }
}
