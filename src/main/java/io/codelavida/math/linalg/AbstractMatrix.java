package io.codelavida.math.linalg;

public abstract class AbstractMatrix implements Matrix {

    protected int rowDimension;
    protected int colDimension;

    protected AbstractMatrix(int rowDimension, int colDimension) {
        this.rowDimension = rowDimension;
        this.colDimension = colDimension;
    }

    @Override
    public int getRowSize() {
        return this.rowDimension;
    }

    @Override
    public int getColumnSize() {
        return this.colDimension;
    }

}
