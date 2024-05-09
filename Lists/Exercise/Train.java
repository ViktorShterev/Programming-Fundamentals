package Lists.Exercise;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.startsWith("Add")) {
                int wagon = Integer.parseInt(command.split(" ")[1]);
                numbers.add(wagon);
            } else {
                int count = Integer.parseInt(command);

                for (int i = 0; i < numbers.size(); i++) {
                    int sum = numbers.get(i) + count;
                    if (sum <= capacity) {
                        numbers.set(i, sum);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

