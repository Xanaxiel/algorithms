package io.codelavida.puzzle;

import java.util.Scanner;

public interface Problem {

    default void describe() {
        System.out.println("Please enter a valid problem name");
    }

    default void solve(Scanner scanner) {
        System.out.println("No interactive implementation");
    }

    static void main(String[] args) {
        System.out.println("Enter a name of the problem");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Problem problem;
        switch (name) {
            case "ActivitySelection":
                problem = new ActivitySelection();
                break;
            case "SubsetSum":
                problem = new SubsetSum();
                break;
            case "Celebrity":
                problem = new Celebrity();
                break;
            default:
                problem = new Problem() {
                };
        }

        problem.describe();
        problem.solve(scanner);
    }

}
