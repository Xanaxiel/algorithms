package io.codelavida.nlp.tokenize;

public interface Tokenizer<T> {

    /**
     * Splits a string into atomic parts.
     *
     * @param cs the input sequence of characters
     * @return array of tokens
     */
    T[] tokenize(CharSequence cs);
}
