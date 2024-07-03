package ExamPreparation2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targetValues = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String input = command.split(" ")[0];
            int index = Integer.parseInt(command.split(" ")[1]);
            int power = Integer.parseInt(command.split(" ")[2]);
            switch (input) {
                case "Shoot":
                    if (index >= 0 && index < targetValues.size()) {
                        int current = targetValues.get(index);
                        if (current > power) {
                            targetValues.set(index, current - power);
                        } else {
                            targetValues.remove(index);
                        }
                    }
                    break;
                case "Add":
                    if (index >= 0 && index < targetValues.size()) {
                        int current = targetValues.get(index);
                        targetValues.add(index, power);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int remove1 = index + power;
                    int remove2 = index - power;
                    if (remove1 < targetValues.size() && remove2 >= 0) {
                        int rotation = power + power + 1;
                        for (int i = 0; i < rotation; i++) {
                            targetValues.remove(index - power);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < targetValues.size() - 1; i++) {
            int num = targetValues.get(i);
            System.out.print(num + "|");
        }
        System.out.print(targetValues.get(targetValues.size() - 1));
    }
}
