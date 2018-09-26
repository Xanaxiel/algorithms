package io.codelavida.nlp.tokenize;

import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class RegexTokenizerTest {

    private Tokenizer<CharSequence> tokenizer;

    @Before
    public void setUp() {
        this.tokenizer = new RegexTokenizer();
    }


    @Test(expected = IllegalArgumentException.class)
    public void testTokenizeEmpty() {
        tokenizer.tokenize("");
    }


    @Test
    public void testTokenize() {
        String text = "Lorem\tipsum\ndolor sit   amet";
        String[] tokens = new String[]{"Lorem", "ipsum", "dolor", "sit",
                "amet"};

        assertThat(tokenizer.tokenize(text)).isEqualTo(tokens);
    }

}