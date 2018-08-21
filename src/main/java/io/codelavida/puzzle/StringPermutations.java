package io.codelavida.puzzle;

import java.util.ArrayList;
import java.util.List;


final class StringPermutations {

    /**
     * Find all the permutations of a given string whose letters are unique.
     * <p>
     * For a string "abcd" the number of permutations is 4! = 24. So the
     * brute force approach will be O(n!).
     * <p>
     * Every permutation starts with one of the four letters a, b, c or d. So
     * once we decide the first letter the problem reduces to find all
     * permutations of the rest 3 letters. This is recursive in nature.
     *
     * @param s input string s
     */
    private static void allPermutations(String s) {
        List<Character> characters = new ArrayList<>(s.length());
        for (char ch : s.toCharArray()) {
            characters.add(ch);
        }
        allPermutations(new ArrayList<>(), characters);

    }

    private static void allPermutations(List<Character> prefixes,
                                        List<Character> suffixes) {
        if (suffixes.size() == 1) {
            for (Character c : prefixes) {
                System.out.print(c);
            }
            System.out.println(suffixes.get(0));
            return;
        }
        for (int i = 0; i < suffixes.size(); ++i) {
            Character ch = suffixes.get(i);
            prefixes.add(ch);
            suffixes.remove(i);
            allPermutations(prefixes, suffixes);
            suffixes.add(i, ch);
            prefixes.remove(ch);

        }
    }

    public static void main(String[] args) {
        allPermutations("abcd");
    }
}
