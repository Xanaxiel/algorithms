package io.codelavida.math;

import java.util.Arrays;
import java.util.Random;

/**
 * Use of array for vector and matrix operations
 */
public final class ArrayMath {

    private static final Random rand = new Random();

    private ArrayMath() {
    }

    public static double[] exp(final double input[]) {
        if (input == null) return null;
        double[] result = Arrays.copyOf(input, input.length);
        for (int i = 0; i < input.length; i++) {
            result[i] = Math.exp(input[i]);
        }
        return result;
    }

    public static double[] log(final double[] input) {
        if (input == null) return null;
        double[] result = Arrays.copyOf(input, input.length);
        for (int i = 0; i < input.length; i++) {
            result[i] = Math.log(input[i]);
        }
        return result;
    }

    public static double[] softmax(final double[] input) {
        if (input == null) return null;
        double[] result = Arrays.copyOf(input, input.length);
        double sum = 0.0;
        for (int i = 0; i < input.length; i++) {
            result[i] = Math.exp(input[i]);
            sum += result[i];
        }
        for (int i = 0; i < result.length; i++) {
            result[i] /= sum;
        }
        return result;
    }

    public static double[] add(final double[] input, double x) {
        if (input == null) return null;
        double[] result = Arrays.copyOf(input, input.length);
        for (int i = 0; i < input.length; i++) {
            result[i] = input[i] + x;
        }

        return result;
    }

    public static double[] multiply(final double[] input, double x) {
        if (input == null) return null;
        double[] result = Arrays.copyOf(input, input.length);
        for (int i = 0; i < input.length; i++) {
            result[i] = input[i] * x;
        }

        return result;
    }

}
