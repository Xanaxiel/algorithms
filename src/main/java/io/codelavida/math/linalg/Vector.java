package io.codelavida.math.linalg;

/**
 * Interface defining a real-valued vector with basic algebraic operations.
 */
public interface Vector {

    /**
     * Returns the size of the vector.
     *
     * @return the size of the vector.
     */
    int getDimension();

    /**
     * Returns the entry at the specified index.
     *
     * @param index location of the entry to be fetched.
     * @return the vector entry at {@code index}.
     * @throws IndexOutOfBoundsException if the index is not valid.
     */
    double getEntry(int index) throws IndexOutOfBoundsException;

    /**
     * Updates an entry at the specified index.
     *
     * @param index location of the entry to be set.
     * @param value value to add to the vector entry.
     * @throws IndexOutOfBoundsException if the index is not valid.
     */
    void setEntry(int index, double value) throws IndexOutOfBoundsException;

    /**
     * Constructs a new vector by appending a vector to this
     *
     * @param v the new vector to be appended
     * @return the result of appending vector v to this vector.
     */
    Vector append(Vector v);

    /**
     * Performs element by element addition of vector v to this vector.
     *
     * @param v the vector to be added.
     * @return the resultant vector
     * @throws DimensionMismatchException if the dimensions of v and this
     *                                    vector are not the same.
     */
    Vector add(Vector v) throws DimensionMismatchException;

    /**
     * Performs an element by element subtraction of vector v from this vector.
     *
     * @param v the vector to be subtracted
     * @return the result of the subtraction
     * @throws DimensionMismatchException if the dimensions of the two
     *                                    vectors are not the same.
     */
    Vector subtract(Vector v) throws DimensionMismatchException;

    /**
     * Performs dot product of this vector with v.
     *
     * @param v the vector to which the dot product to be applied.
     * @return the resulting value of the dot product.
     * @throws DimensionMismatchException if the dimensions of the vector v
     *                                    and this vector do not match.
     */
    double dot(Vector v) throws DimensionMismatchException;


}
