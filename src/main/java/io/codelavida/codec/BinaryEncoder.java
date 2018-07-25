package io.codelavida.codec;

/**
 * Interface for all the encoders.
 */
public interface BinaryEncoder {

    /**
     * Encodes the source and returns the encoded content.
     *
     * @param source byte array to encode
     * @return encoded byte array
     */
    byte[] encode(byte[] source);
}
