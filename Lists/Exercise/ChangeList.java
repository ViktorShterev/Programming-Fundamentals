package Lists.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.startsWith("Delete")) {
                int elementToDelete = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(Collections.singleton(elementToDelete));
            } else if (command.startsWith("Insert")) {
                String [] insert = command.split(" ");
                int indexInsert = Integer.parseInt(insert[2]);
                int elementInsert = Integer.parseInt(insert[1]);
                numbers.add(indexInsert, elementInsert);
            }
            command = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
