package io.codelavida.puzzle;

public class NQueens implements Problem {

    @Override
    public String getName() {
        return "N Queens";
    }

    @Override
    public String getDescription() {
        return "Given an N x N board, place N queens on the board,\n" +
                "so that no two queens attack each other.";
    }

    @Override
    public String getSolution() {
       return "";
    }

    private static int numComparisons = 0;
    private static int numMethodCalls = 0;
    private static int numSolutions = 0;

    /**
     * Place n queens on the board of size n x n.
     * The brute force approach which is exponential runtime algorithm is to
     * verify all of the possible states (n^n) see if any two queens attack
     * each other {@code isLegal()}.
     * <p>
     * One improvement is eliminate checking on some conditions. This reduces
     * the exponential runtime into factorial runtime.
     * <p>
     * We can do this recursively checking all states as long as it is valid.
     *
     * @param n integer representing the number of queens
     */
    public static void placeQueens(int n) {
        if (n == 0) {
            throw new IllegalArgumentException("Board must be of size N x N");
        }
        numMethodCalls = 0;
        numComparisons = 0;
        numSolutions = 0;
        System.out.println("For N = " + n);
        System.out.println("============");
        if (n > 3) {
            // columns contains the column index j for placing the ith queen
            int[] columns = new int[n];
            placeQueens(columns, 0);
            System.out.println("Number of numComparisons = " + numComparisons);
            System.out.println("Number of Recursive calls = " + numMethodCalls);
        }
        System.out.println("Number of numSolutions = " + numSolutions);
    }

    private static void placeQueens(int[] columns, int row) {
        numMethodCalls++;
        if (row == columns.length) {
            printSolution(columns, row);
        } else {
            for (int j = 0; j < columns.length; j++) {
                if (isLegal(columns, row, j)) {
                    columns[row] = j;
                    placeQueens(columns, row + 1);
                }
            }
        }

    }

    private static void printSolution(int[] columns, int row) {
        numSolutions++;
        System.out.print(System.lineSeparator());
        System.out.println("Solution " + numSolutions);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns.length; j++) {
                if (j == columns[i]) {
                    System.out.print("Q ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.print(System.lineSeparator());
        }
    }

    /**
     * Check if given all the previous placements, whether we can place
     * the ith queen at (row, col) position.
     *
     * @param columns current placements
     * @param row     the current row in which we will place a queen
     * @param col     the column to be checked for validity
     * @return true if after placing the queen at (row, col) the board
     * is in a valid state.
     */
    private static boolean isLegal(int[] columns, int row, int col) {
        boolean legal = true;
        for (int i = 0; i < row; i++) {
            numComparisons++;
            if (columns[i] == col
                    || columns[i] == (col + row - i)
                    || columns[i] == (col - row + i)) {
                legal = false;
                break;
            }
        }
        return legal;
    }
}
