package io.codelavida.algorithm.sort;

import static io.codelavida.Util.*;
import static java.lang.System.out;

public class Benchmark {

    public static void main(String[] args) {
        out.println("SORTING BENCHMARK");
        out.println("-----------------");
        int[] data = getRandomArray(100000);
        Stopwatch sw = new Stopwatch();

        int[] copy = data.clone();
        sw.start();
        Selection.sort(copy);
        sw.stop();
        out.println("Selection sort = " + sw.duration());

        copy = data.clone();
        sw.start();
        Insertion.sort(copy);
        sw.stop();
        out.println("Insertion sort = " + sw.duration());

        copy = data.clone();
        sw.start();
        Merge.sort(copy);
        sw.stop();
        out.println("Merge sort     = " + sw.duration());

        copy = data.clone();
        sw.start();
        Quick.sort(copy);
        sw.stop();
        out.println("Quick sort     = " + sw.duration());

        copy = data.clone();
        sw.start();
        Heap.sort(copy);
        sw.stop();
        out.println("Heap sort      = " + sw.duration());

    }
}
