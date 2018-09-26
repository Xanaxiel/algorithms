package io.codelavida.nlp.tokenize;

import io.codelavida.text.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A word tokenizer using regular expressions.
 */
public class RegexTokenizer implements Tokenizer<CharSequence> {

    @Override
    public CharSequence[] tokenize(CharSequence cs) {

        if (StringUtils.isBlank(cs)) {
            throw new IllegalArgumentException("Empty or null argument was " +
                    "passed");
        }

        Pattern pattern = Pattern.compile("(\\w)+");
        Matcher matcher = pattern.matcher(cs.toString());

        List<String> tokens = new ArrayList<>();

        while (matcher.find()) {
            tokens.add(matcher.group(0));
        }

        return tokens.toArray(new String[0]);
    }
}
