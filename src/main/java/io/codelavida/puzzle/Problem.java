package io.codelavida.puzzle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public interface Problem {

    String name();

    void describe();

    void solve(Scanner scanner);

    static void main(String[] args) {
        Map<String, Problem> problemMap = new HashMap<>();
        problemMap.put("AC", new ActivitySelection());
        problemMap.put("SU", new SubsetSum());
        problemMap.put("CE", new Celebrity());
        problemMap.put("NQ", new NQueens());

        while (true) {
            problemMap.forEach((key, value) -> System.out.println(key + ":" + value.name()));

            System.out.println(System.lineSeparator());

            System.out.println("Enter one of the problem code from the list above");
            System.out.println("To exit input something else");

            Scanner scanner = new Scanner(System.in);
            String code = scanner.nextLine().toUpperCase();

            Problem problem = problemMap.get(code);

            if (problem != null) {
                problem.describe();
                problem.solve(scanner);
            } else {
                System.out.println("Goodbye");
                System.exit(0);
            }
        }
    }

}
