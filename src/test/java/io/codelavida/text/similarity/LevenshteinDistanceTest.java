package io.codelavida.text.similarity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LevenshteinDistanceTest {

    private LevenshteinDistance levenshteinDistance;


    @Before
    public void setUp() {
        this.levenshteinDistance = LevenshteinDistance.getDefaultInstance();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        levenshteinDistance.apply(null, "something");

    }

    @Test
    public void testEmptySequence() {
        Assert.assertEquals(
                "Should return the length of other sequence if one is empty",
                Integer.valueOf(9),
                levenshteinDistance.apply("", "something")
        );
    }

    @Test
    public void testEqualLengthSequences(){
        Assert.assertEquals(
                "Should return Levenshtein distance if first sequence is smaller",
                Integer.valueOf(1),
                levenshteinDistance.apply("goat", "boat")
        );
    }

    @Test
    public void testFirstSequenceSmaller(){
        Assert.assertEquals(
                "Should return Levenshtein distance if first sequence is smaller",
                Integer.valueOf(2),
                levenshteinDistance.apply("got", "boat")
        );
    }

}