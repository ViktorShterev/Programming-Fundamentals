package ExamPreparation2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 100;
        int bitcoins = 0;
        List<String> rooms = Arrays.stream(scanner.nextLine()
                        .split("\\|"))
                .collect(Collectors.toList());
        int count = 0;

        for (int i = 0; i < rooms.size(); i++) {

            List<String> command = List.of(rooms.get(i).split(" "));
            count++;
            String name = command.get(0);
            int number = Integer.parseInt(command.get(1));

            if (name.equals("potion")) {
                int hpNeeded = 100 - health;
                if (number > hpNeeded) {
                    number = hpNeeded;
                    System.out.printf("You healed for %d hp.\n", number);
                } else {
                    System.out.printf("You healed for %d hp.\n", number);
                }
                health += number;
                System.out.printf("Current health: %d hp.\n", health);
            } else if (name.equals("chest")) {
                bitcoins += number;
                System.out.printf("You found %d bitcoins.\n", number);
            } else {
                health -= number;
                if (health > 0) {
                    System.out.printf("You slayed %s.\n", name);
                } else {
                    System.out.printf("You died! Killed by %s.\n", name);
                    System.out.printf("Best room: %d\n", count);
                    break;
                }
            }
        }
        if (health > 0) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d\n", bitcoins);
            System.out.printf("Health: %d", health);
        }
    }
}
