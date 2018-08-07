package io.codelavida.java.cookbook;

/**
 * Using java.lang.String
 */
public class Strings {

    public static void main(String[] args) {
        String s = "This is a string";
        String b = s.substring(0, 4);
        System.out.println(b);

        for (char c : s.toCharArray()) {
            System.out.print(c);
        }

        System.out.println(checksum(s));
    }

    private static int checksum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i);
        }
        return sum;
    }
}
