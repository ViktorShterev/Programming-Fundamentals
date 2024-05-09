package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            if (command.startsWith("Add")) {
                int addEl = Integer.parseInt(command.split(" ")[1]);
                numbers.add(addEl);
            } else if (command.startsWith("Insert")) {
                int indexEl = Integer.parseInt(command.split(" ")[2]);
                int insertEl = Integer.parseInt(command.split(" ")[1]);
                if (indexEl >= numbers.size() || indexEl < 0) {
                    System.out.println("Invalid index");
                } else {
                    numbers.add(indexEl, insertEl);
                }
            } else if (command.startsWith("Remove")) {
                int removeIndex = Integer.parseInt(command.split(" ")[1]);
               if (removeIndex >= numbers.size() || removeIndex < 0) {
                   System.out.println("Invalid index");
                } else {
                   numbers.remove(removeIndex);
               }
            } else if (command.startsWith("Shift left")) {
                int leftEl = Integer.parseInt(command.split(" ")[2]);
                for (int i = 1; i <= leftEl; i++) {
                    int shiftLeft = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(shiftLeft);
                }
            } else if (command.startsWith("Shift right")) {
                int rightEl = Integer.parseInt(command.split(" ")[2]);
                for (int i = 1; i <= rightEl; i++) {
                    int shiftRight = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, shiftRight);
                }
            }
            command = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
