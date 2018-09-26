package io.codelavida.text.similarity;

import io.codelavida.nlp.tokenize.RegexTokenizer;
import io.codelavida.nlp.tokenize.Tokenizer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Measures the cosine distance between two character sequences.
 */
public class CosineDistance implements EditDistance<Double> {

    private final Tokenizer<CharSequence> tokenizer = new RegexTokenizer();

    @Override
    public Double apply(CharSequence left, CharSequence right) {
        CharSequence[] leftTokens = tokenizer.tokenize(left);
        CharSequence[] rightTokens = tokenizer.tokenize(right);

        Map<CharSequence, Integer> leftVector = count(leftTokens);
        Map<CharSequence, Integer> rightVector = count(rightTokens);

        double similarity = cosineSimilarity(leftVector, rightVector);

        return 1.0 - similarity;
    }

    private Map<CharSequence, Integer> count(CharSequence[] tokens) {

        Map<CharSequence, Integer> counter = new HashMap<>();

        for (CharSequence token : tokens) {
            if (counter.containsKey(token)) {
                counter.put(token, counter.get(token) + 1);
            } else {
                counter.put(token, 1);
            }
        }

        return counter;
    }


    /**
     * Calculates the cosine similarity between two vectors.
     * <p>
     * Refer to https://en.wikipedia.org/wiki/Cosine_similarity
     *
     * @param leftVector  left vector
     * @param rightVector right vector
     * @return the cosine similarity score
     */
    double cosineSimilarity(Map<CharSequence, Integer> leftVector,
                            Map<CharSequence, Integer> rightVector) {

        if (leftVector == null || rightVector == null) {
            throw new IllegalArgumentException("Vectors must be not null");
        }

        double cosineSimilarity;
        Set<CharSequence> intersection = getInterSection(leftVector,
                rightVector);

        double dotProduct = dot(leftVector, rightVector, intersection);

        double d1 = 0.0d;

        for (Integer value : leftVector.values()) {
            d1 += Math.pow(value, 2);
        }

        double d2 = 0.0d;

        for (Integer value : rightVector.values()) {
            d2 += Math.pow(value, 2);
        }

        if (d1 <= 0.0 || d2 <= 0.0) {
            cosineSimilarity = 0.0;
        } else {
            cosineSimilarity = dotProduct / (Math.sqrt(d1) * Math.sqrt(d2));
        }

        return cosineSimilarity;

    }

    private double dot(Map<CharSequence, Integer> leftVector,
                       Map<CharSequence, Integer> rightVector,
                       Set<CharSequence> intersection) {
        long dotProduct = 0;
        for (CharSequence key : intersection) {
            dotProduct += leftVector.get(key) * rightVector.get(key);
        }

        return dotProduct;
    }

    private Set<CharSequence> getInterSection(
            Map<CharSequence, Integer> leftVector,
            Map<CharSequence, Integer> rightVector) {

        Set<CharSequence> intersection = new HashSet<>(leftVector.keySet());

        intersection.retainAll(rightVector.keySet());

        return intersection;
    }


}
