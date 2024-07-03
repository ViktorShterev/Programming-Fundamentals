package ExamPreparation2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split("@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        int jump = 0;
        int sum = 0;
        int count = 0;
        while (!command.equals("Love!")) {

            jump = Integer.parseInt(command.split(" ")[1]);
            sum += jump;
            int person = numbers.get(jump);

            if (sum >= numbers.size()) {
                jump = sum - numbers.size();
                getCupids(numbers, person, jump, count);
            } else {
                getCupids(numbers, person, jump, count);
            }
            command = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.\n", jump);
        if (count == numbers.size()) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", numbers.size() - count);
        }
    }

    private static void getCupids(List<Integer> numbers, int person, int sum, int count) {
        if (person == 0) {
            System.out.printf("Place %d already had Valentine's day.\n", sum);
        } else if (person - 2 <= 0) {
            count++;
            System.out.printf("Place %d has Valentine's day.\n", sum);
        } else if (person > 0) {
            numbers.set(sum, person - 2);
        }
    }
}
