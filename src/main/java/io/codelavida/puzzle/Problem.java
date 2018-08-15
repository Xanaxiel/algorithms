package io.codelavida.puzzle;

import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public interface Problem {

    String getName();

    String getDescription();

    String getSolution();

    default void demo(Scanner scanner) {
        System.out.println("No demo available");
    }

    @SuppressWarnings("unchecked")
    static void main(String[] args) {
        Map<String, Problem> problemMap = new HashMap<>();

        Package pkg = Problem.class.getPackage();
        Reflections problemsPkg = new Reflections(pkg.getName());
        Set<Class<? extends Problem>> problemClasses = problemsPkg.getSubTypesOf(Problem.class);
        int i = 1;
        for (Class c : problemClasses) {
            String code = "P" + i++;
            try {
                Problem p = (Problem) c.getConstructor().newInstance();
                problemMap.put(code, p);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        while (true) {
            problemMap.forEach((key, value) -> System.out.println(key + ":" + value.getName()));

            System.out.println(System.lineSeparator());

            System.out.println("Enter one of the problem code from the list above");
            System.out.println("To exit input something else");

            Scanner scanner = new Scanner(System.in);
            String code = scanner.nextLine().toUpperCase();

            Problem problem = problemMap.get(code);

            if (problem != null) {
                System.out.println("--PROBLEM--");
                System.out.println(problem.getDescription());

                System.out.println("--SOLUTION--");
                System.out.print(problem.getSolution());

                System.out.println("See demo? [Enter Y or N]");
                String answer = scanner.nextLine();
                if ("Y".equalsIgnoreCase(answer)) {
                    System.out.println("--DEMO--");
                    problem.demo(scanner);
                }
            } else {
                System.out.println("Goodbye");
                System.exit(0);
            }
        }
    }

}
