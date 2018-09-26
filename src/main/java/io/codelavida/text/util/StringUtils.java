package io.codelavida.text.util;

/**
 * Contains static methods to manipulate {@link java.lang.String}
 */
public final class StringUtils {

    private StringUtils() {

    }

    public static boolean isBlank(CharSequence cs) {
        return (cs == null || cs.toString().trim().length() == 0);
    }

}
