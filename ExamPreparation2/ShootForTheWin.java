package ExamPreparation2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        int count = 0;
        while (!command.equals("End")) {
            int index = Integer.parseInt(command);
            List<Integer> numbers = new ArrayList<>();
            for (Integer number : numbers) {
                if (number == index) {
                    command = scanner.nextLine();
                    break;
                }
            }
            if (index >= 0 && index < targets.size()) {
                count++;
                int current = targets.get(index);
                targets.set(index, -1);
                for (int i = 0; i < targets.size(); i++) {
                    if (index != i) {
                        int nextTarget = targets.get(i);
                        if (nextTarget > current && nextTarget != -1) {
                            targets.set(i, nextTarget - current);
                        } else if (nextTarget <= current && nextTarget != - 1){
                            targets.set(i, nextTarget + current);
                        }
                    }
                }

            }
            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", count);
        for (Integer target : targets) {
            System.out.print(target + " ");
        }
    }
}
