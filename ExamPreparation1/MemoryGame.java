package ExamPreparation1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = Arrays.stream(scanner.nextLine()
                .split(" "))
                .collect(Collectors.toList());

        List<String> commands = Arrays.stream(scanner.nextLine()
                .split(" "))
                .collect(Collectors.toList());
        int moves = 0;
        while (!commands.contains("end")) {
            moves++;
            String move = "-" + moves + "a";
            int index1 = Integer.parseInt(commands.get(0));
            int index2 = Integer.parseInt(commands.get(1));

            if (index1 == index2 || index1 < 0 || index1 >= inputs.size()
                    || index2 < 0 || index2 >= inputs.size()) {
                if (inputs.size() % 2 == 0) {
                    inputs.add(inputs.size() / 2, move);
                    inputs.add(inputs.size() / 2 + 1, move);
                } else {
                    inputs.add(inputs.size() / 2 + 1, move);
                    inputs.add(inputs.size() / 2, move);
                }
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                 String element1 = inputs.get(index1);
                String element2 = inputs.get(index2);

                if (element1.equals(element2)) {
                    inputs.remove(element1);
                    inputs.remove(element2);
                    System.out.printf("Congrats! You have found matching elements - %s!\n", element1);
                    if (inputs.size() < 1) {
                        System.out.printf("You have won in %s turns!", moves);
                        break;
                    }
                } else {
                    System.out.println("Try again!");
                }
            }
            commands = Arrays.stream(scanner.nextLine()
                            .split(" "))
                    .collect(Collectors.toList());
        }
        if (commands.contains("end")) {
            System.out.println("Sorry you lose :(");
            System.out.printf(String.join(" ", inputs));
        }
    }
}
