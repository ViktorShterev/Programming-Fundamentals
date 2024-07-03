package ExamPreparation2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        List<Integer> lifts = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int max = 4;
        int empty = 0;
        int last = 0;
        for (int i = 0; i < lifts.size(); i++) {
            if (people > 0) {
                int count = lifts.get(i);
                while (count < max) {
                    if (people <= 0) {
                        last++;
                        break;
                    }
                    count++;
                    lifts.set(i, count);
                    people--;
                }
            } else {
                empty++;
            }
        }
        if (empty >= 1 || last >= 1) {
            System.out.println("The lift has empty spots!");
            for (int lift : lifts) {
                System.out.print(lift + " ");
            }
        } else if (people > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!\n", people);
            for (int lift : lifts) {
                System.out.print(lift + " ");
            }
        } else {
            for (int lift : lifts) {
                System.out.print(lift + " ");
            }
        }
    }
}
