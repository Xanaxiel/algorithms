package io.codelavida.text.similarity;


import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class CosineDistanceTest {

    @Test
    public void testCosineDistanceSameTexts() {

        CharSequence text1 = "The quick brown fox jumps over the lazy dog";
        CharSequence text2 = "The quick brown fox jumps over the lazy dog";

        CosineDistance cosineDistance = new CosineDistance();

        assertThat(cosineDistance.apply(text1, text2)).isEqualTo(0.0);
    }

    @Test
    public void testCosineDistanceDifferentTexts() {

        CharSequence text1 = "The quick brown fox jumps over the lazy dog";
        CharSequence text2 = "The lazy dog was jumped over by the quick brown" +
                " fox";

        CosineDistance cosineDistance = new CosineDistance();

        double distance = cosineDistance.apply(text1, text2);

        assertThat(distance).isEqualTo(0.19596974779263032);
    }

}