package io.codelavida.puzzle;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class CelebrityTest {

    private int randomCelebrity(boolean[][] knows, int total) {
        int c = new Random().nextInt(total);
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                knows[i][j] = i != c;
            }
        }
        return c;
    }

    @Test
    public void testFindCelebrity() {
        int n = new Random().nextInt(100);
        boolean[][] knows = new boolean[n][n];
        assertEquals(randomCelebrity(knows, n), Celebrity.findCelebrity(knows));
    }
}