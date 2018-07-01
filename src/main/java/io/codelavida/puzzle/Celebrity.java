package io.codelavida.puzzle;

public class Celebrity implements Problem {

    @Override
    public void describe() {
        System.out.println(
                "Celebrity Problem\n" +
                        "A celebrity among a group of n people is a person\n" +
                        "who knows nobody but is known by everybody else.\n" +
                        "The task is to identify a celebrity by only asking\n" +
                        "questions to people of the following form: “Do you\n" +
                        "know this person?\n");

        System.out.println(
                "The brute force approach is to for every person, it at\n" +
                        "least knows 1 person. The solution has O(n^2) time complexity.\n" +
                        "A better approach is to solve it by decrease one and conquer,\n" +
                        "for a pair of people (i, j) if i knows j then i is no longer\n" +
                        "considered otherwise j is no longer considered as a celebrity.\n" +
                        "Recursively solve it for the remaining people until the base\n" +
                        "case is where two people remaining.");
    }

    /**
     * @param knows n * n matrix, where data[i][j] is true if i knows j
     *              and false otherwise
     * @return the id of the celebrity.
     */
    public static int findCelebrity(boolean[][] knows) {
        int n = knows[0].length;
        return findCelebrityRecur(0, 1, n, knows);
    }

    private static int findCelebrityRecur(int p1, int p2, int numPeople, boolean[][] knows) {
        if (p1 == numPeople - 1 || p2 == numPeople - 1) {
            if (knows[p1][p2])
                return p2;
            else return p1;
        }
        if (knows[p1][p2]) {
            return findCelebrityRecur(p2, p2 + 1, numPeople, knows);
        } else {
            return findCelebrityRecur(p1, p2 + 1, numPeople, knows);
        }

    }
}
