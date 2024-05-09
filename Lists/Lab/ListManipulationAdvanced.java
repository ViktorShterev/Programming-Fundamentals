package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {

            if (input.startsWith("Contains")) {
                int contain = Integer.parseInt(input.split(" ")[1]);
                if (numbers.contains(contain)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (input.equals("Print even")) {
                for (int even : numbers) {
                    if (even % 2 == 0) {
                        System.out.print(even + " ");
                    }
                }
            } else if (input.equals("Print odd")) {
                for (int odd : numbers) {
                    if (odd % 2 != 0) {
                        System.out.print(odd + " ");
                    }
                }
            } else if (input.equals("Get sum")) {
                int sum = 0;
                for (int number : numbers) {
                    sum += number;
                }
                System.out.println(sum);
            } else if (input.startsWith("Filter")) {
                String [] filterParts = input.split(" ");
                String condition = filterParts[1];
                int num = Integer.parseInt(filterParts[2]);

                printFiltered(numbers, condition, num);
            }

            if (input.contains("Print even") || input.contains("Print odd") || input.contains("Filter")) {
                System.out.println();
            }
            input = scanner.nextLine();
        }
    }

    private static void printFiltered(List<Integer> numbers, String condition, int num) {
        switch (condition) {
            case "<":
                for (int number : numbers) {
                    if (number < num) {
                        System.out.print(number + " ");
                    }
                }
                break;
            case ">":
                for (int number : numbers) {
                    if (number > num) {
                        System.out.print(number + " ");
                    }
                }
                break;
            case "<=":
                for (int number : numbers) {
                    if (number <= num) {
                        System.out.print(number + " ");
                    }
                }
                break;
            case ">=":
                for (int number : numbers) {
                    if (number >= num) {
                        System.out.print(number + " ");
                    }
                }
                break;
        }
    }
}
