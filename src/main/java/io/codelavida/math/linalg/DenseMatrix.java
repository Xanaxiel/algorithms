package io.codelavida.math.linalg;

public class DenseMatrix extends AbstractMatrix {

    private double[][] values;


    public DenseMatrix(double[][] values) {
        this(values, false);
    }

    public DenseMatrix(double[][] values, boolean shallowCopy) {
        super(values.length, values[0].length);
        if (shallowCopy) {
            this.values = values;
        } else {
            this.values = new double[values.length][];
            for (int i = 0; i < values.length; i++) {
                this.values[i] = values[i].clone();
            }
        }
    }

    public DenseMatrix(int rowDimension, int colDimension) {
        super(rowDimension, colDimension);
        this.values = new double[rowDimension][colDimension];
    }

    @Override
    public Matrix createMatrix(int rowDimension, int colDimension) {
        return new DenseMatrix(rowDimension, colDimension);
    }

    @Override
    public Matrix add(Matrix m) {
        return null;
    }

    @Override
    public Matrix subtract(Matrix m) {
        return null;
    }

    @Override
    public Matrix multiply(Matrix m) throws DimensionMismatchException {
        return null;
    }

    @Override
    public Matrix scalarAdd(double d) {
        return null;
    }

    @Override
    public Matrix scalarMultiply(double d) {
        return null;
    }

    @Override
    public boolean isSquare() {
        return false;
    }

    @Override
    public int getRowDimensions() {
        return 0;
    }

    @Override
    public int getColumnDimensions() {
        return 0;
    }

    @Override
    public double[][] getData() {
        return new double[0][];
    }

    @Override
    public double getNorm() {
        return 0;
    }

    @Override
    public double getTrace() {
        return 0;
    }

    @Override
    public Matrix transpose() {
        return null;
    }

    @Override
    public double determinant() {
        return 0;
    }
}
