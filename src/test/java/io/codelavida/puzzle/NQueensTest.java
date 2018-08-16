package io.codelavida.puzzle;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;


public class NQueensTest {

    @Test
    public void testPlaceNQueens(){
        NQueens nQueens = new NQueens();
        assertThat(nQueens.placeQueens(3)).isEqualTo(0);
        assertThat(nQueens.placeQueens(4)).isEqualTo(2);
    }
}