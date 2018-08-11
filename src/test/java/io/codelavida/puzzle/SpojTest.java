package io.codelavida.puzzle;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class SpojTest {

    @Test
    public void testZerosInRange() {
        assertThat(Spoj.zerosInRange(0, 10)).isEqualTo(2);
        assertThat(Spoj.zerosInRange(1, 100)).isEqualTo(11);
    }

}