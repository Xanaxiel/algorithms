package io.codelavida.math.linalg;

public class DimensionMismatchException extends Exception {

    private int actual;
    private int expected;

    public DimensionMismatchException(int actual, int expected) {
        this.actual = actual;
        this.expected = expected;
    }

    @Override
    public String getMessage() {
        return String.format("Dimension mismatch expected=%4s, actual=%4s",
                expected, actual);
    }

}
