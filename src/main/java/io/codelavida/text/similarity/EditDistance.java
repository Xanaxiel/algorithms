package io.codelavida.text.similarity;

import java.util.function.BiFunction;

public interface EditDistance<R> extends BiFunction<CharSequence,
        CharSequence, R> {

}
