package io.codelavida.math.linalg;

public class DenseVector extends AbstractVector {
    @Override
    public int getDimension() {
        return 0;
    }

    @Override
    public double getEntry(int index) throws IndexOutOfBoundsException {
        return 0;
    }

    @Override
    public void setEntry(int index, double value) throws IndexOutOfBoundsException {

    }

    @Override
    public Vector append(Vector v) {
        return null;
    }

    @Override
    public Vector add(Vector v) throws DimensionMismatchException {
        return null;
    }

    @Override
    public Vector subtract(Vector v) throws DimensionMismatchException {
        return null;
    }

    @Override
    public double dot(Vector v) throws DimensionMismatchException {
        return 0;
    }
}
