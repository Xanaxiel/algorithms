package io.codelavida.java.cookbook;

import java.util.Arrays;

/**
 * A collection of functional programming code snippets in Java.
 *
 */
public final class FunctionalRecipes {
    private FunctionalRecipes() {
    }


    public static void main(String[] args) {
        int[] anArray = io.codelavida.ds.ArrayUtil.getRandomArray(40);
        Arrays.parallelSort(anArray);
        Arrays.stream(anArray).forEach(System.out::println);
    }

}
