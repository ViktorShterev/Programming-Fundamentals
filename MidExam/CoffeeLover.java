package MidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> coffees = Arrays.stream(scanner.nextLine()
                .split(" "))
                .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();

            String command1 = input.split(" ")[0];

            if (command1.equals("Include")) {
                String coffee = input.split(" ")[1];
                coffees.add(coffee);
            } else if (command1.equals("Remove")) {
                String position = input.split(" ")[1];
                int number = Integer.parseInt(input.split(" ")[2]);
                switch (position) {
                    case "first":
                        if (number < coffees.size()) {
                            for (int j = 0; j < number; j++) {
                                coffees.remove(0);
                            }
                        }
                        break;
                    case "last":
                        if (number < coffees.size()) {
                            for (int j = 0; j < number; j++) {
                                coffees.remove(coffees.size() - 1);
                            }
                        }
                        break;
                }
            } else if (command1.equals("Prefer")) {
                int index1 = Integer.parseInt(input.split(" ")[1]);
                int index2 = Integer.parseInt(input.split(" ")[2]);

                if (index1 >= 0 && index1 < coffees.size() && index2 >= 0 && index2 < coffees.size()) {
                    String first = coffees.get(index1);
                    String second = coffees.get(index2);
                    coffees.set(index1, second);
                    coffees.set(index2, first);
                }
            } else if (command1.equals("Reverse")) {
                Collections.reverse(coffees);
            }
        }
        System.out.println("Coffees:");
        System.out.println(String.join(" ", coffees));
    }
}
