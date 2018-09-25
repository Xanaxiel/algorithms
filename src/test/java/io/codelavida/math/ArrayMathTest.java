package io.codelavida.math;

import io.codelavida.math.util.ArrayMath;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayMathTest {

    @Test
    public void testExp() {
        double[] input = {1.0, 2.0, 3.0};
        double[] expected = {Math.exp(1.0), Math.exp(2.0), Math.exp(3.0)};
        assertArrayEquals(expected, ArrayMath.exp(input), 0.001);
        assertArrayEquals(null, ArrayMath.exp(null), 0.001);
        double[] empty = {};
        assertArrayEquals(empty, ArrayMath.exp(empty), 0.001);
    }

    @Test
    public void testLog() {
        double[] input = {1.0, 2.0, 3.0};
        double[] expected = {Math.log(1.0), Math.log(2.0), Math.log(3.0)};
        assertArrayEquals(expected, ArrayMath.log(input), 0.001);
    }

    @Test
    public void testSoftmax() {
        double[] input = {1.0, 2.0, 3.0, 4.0, 1.0, 2.0, 3.0};
        double[] expected = {0.024, 0.064, 0.175, 0.475, 0.024, 0.064, 0.175};
        assertArrayEquals(expected, ArrayMath.softmax(input), 0.001);
    }

    @Test
    public void testAdd() {
        double[] input = {1.0, 2.0, 3.0, 4.0};
        double[] expected = {2.0, 3.0, 4.0, 5.0};
        assertArrayEquals(expected, ArrayMath.add(input, 1.0), 0.0001);
    }

    @Test
    public void testMultiply() {
        double[] input = {1.0, 2.0, 3.0, 4.0};
        double[] expected = {2.0, 4.0, 6.0, 8.0};
        assertArrayEquals(expected, ArrayMath.multiply(input, 2.0), 0.0001);
    }
}