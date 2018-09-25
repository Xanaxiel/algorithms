package io.codelavida.math.linalg;

/**
 * An interface to a matrix with basic algebraic operations.
 */
public interface Matrix {


    int getColumnSize();

    int getRowSize();

    /**
     * Creates a new Matrix of row and column dimensions.
     *
     * @param rowDimension the number of rows in the new matrix
     * @param colDimension the number of columns in the new matrix
     * @return a new matrix of the instance calling this method.
     */
    Matrix createMatrix(int rowDimension, int colDimension);

    /**
     * Add the matrix m to this matrix
     *
     * @param m the matrix instance to be added
     * @return the result of the addition of the two matrices
     */
    Matrix add(Matrix m);

    /**
     * Subtracts the matrix m from this matrix
     *
     * @param m the matrix to be subtracted.
     * @return the result of the subtraction
     */
    Matrix subtract(Matrix m);

    /**
     * Matrix multiplication this * m
     *
     * @param m the matrix to multiply with this
     * @return the result of the multiplication
     */
    Matrix multiply(Matrix m) throws DimensionMismatchException;

    /**
     * Add a scalar d to each element of the matrix
     *
     * @param d the scalar value
     * @return the resulting matrix
     */
    Matrix scalarAdd(double d);

    /**
     * Multiply a scalar value d to each element of the matrix
     *
     * @param d the input scalar value
     * @return the result of the multiplication
     */
    Matrix scalarMultiply(double d);

    /**
     * Check if the matrix is square
     *
     * @return true if the matrix is square otherwise false.
     */
    boolean isSquare();

    /**
     * Returns the number of rows in the matrix
     *
     * @return integer representing the number of rows
     */
    int getRowDimensions();

    /**
     * Returns the number of columns in the matrix
     *
     * @return integer representing the number of columns in the matrix
     */
    int getColumnDimensions();

    /**
     * Returns matrix entries as a two-dimensional array.
     *
     * @return 2-d array of entries
     */
    double[][] getData();

    /**
     * Returns the absolute row sum norm of the matrix.
     *
     * @return norm of the matrix
     */
    double getNorm();

    /**
     * Returns the trace of the matrix that is the sum of the elements of the
     * main diagonal.
     *
     * @return the trace.
     */
    double getTrace();

    /**
     * Returns the transpose of this matrix.
     *
     * @return the transpose
     */
    Matrix transpose();

    /**
     * Returns the determinant of the matrix
     *
     * @return the determinant
     */
    double determinant();

}
