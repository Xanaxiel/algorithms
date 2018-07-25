package io.codelavida.codec;

public interface BinaryDecoder {

    /**
     * Decodes an encoded bytes array.
     *
     * @param source the byte array to decode
     * @return the decoded byte array
     */
    byte[] decode(byte[] source);
}
