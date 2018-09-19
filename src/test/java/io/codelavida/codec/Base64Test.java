package io.codelavida.codec;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class Base64Test {

    @Ignore
    public void testB64EncodeString() {
        byte[] source = ("Man is distinguished, not only by his reason, but by " +
                "this singular passion from other animals, which is a lust of " +
                "the mind, that by a perseverance of delight in the continued " +
                "and indefatigable generation of knowledge, exceeds the short " +
                "vehemence of any carnal pleasure.").getBytes();
        byte[] encoded = java.util.Base64.getEncoder().encode(source);
        assertArrayEquals(encoded, Base64.getEncoder().encode(source));
    }

}