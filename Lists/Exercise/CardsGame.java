package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> player1 = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> player2 = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < player1.size(); i++) {
            int card = player1.get(i);
            int card2 = player2.get(i);
            if (card > card2) {
                player1.remove(i);
                player1.add(card);
                player1.add(card2);

                player2.remove(i);
            } else if (card == card2) {
                player1.remove(i);
                player2.remove(i);
            } else if (card < card2) {
                player2.remove(i);
                player2.add(card2);
                player2.add(card);

                player1.remove(i);
            }
            int sum = 0;

            if (player1.size() < 1) {
                for (int integer : player2) {
                    sum += integer;
                }
                System.out.printf("Second player wins! Sum: %d", sum);
                break;
            } else if (player2.size() < 1) {
                for (int integer : player1) {
                    sum += integer;
                }
                System.out.printf("First player wins! Sum: %d", sum);
                break;
            }
            i -= 1;
        }
    }
}
