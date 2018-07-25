package io.codelavida.codec;

/**
 * Refer - https://en.wikipedia.org/wiki/Base64
 * <p>
 * Encodes binary data in an ASCII string format by translating it into a
 * 64-radix representation. Each base64 digit represents exactly 6 bits of
 * data. Three 8-bit bytes can be represented by four 6-bit base64 digits.
 */
public class Base64 implements BinaryEncoder, BinaryDecoder {


    /**
     * Standard base64 index table
     */
    private static final byte[] ENCODE_TABLE = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'
    };


    private Base64() {
    }

    private static Base64 encoder;

    public static BinaryEncoder getEncoder() {
        if (encoder == null) {
            encoder = new Base64();
        }
        return encoder;
    }

    @Override
    public byte[] decode(final byte[] in) {
        return new byte[0];
    }

    @Override
    public byte[] encode(byte[] source) {
        return new byte[0];
    }
}
