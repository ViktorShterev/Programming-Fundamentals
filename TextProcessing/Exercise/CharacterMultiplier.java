package TextProcessing.Exercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String first = input.split(" ")[0];
        String second = input.split(" ")[1];

        System.out.println(multiply(first, second));
    }
    public static int multiply (String first, String second) {
        int sum = 0;
        for (int i = 0; i < first.length(); i++) {
            int number1 = first.charAt(i);
            if (i >= second.length()) {
                sum += number1;
            } else {
                int number2 = second.charAt(i);
                sum = sum + number1 * number2;
            }
        }
        if (first.length() < second.length()) {
            for (int i = second.length() - first.length(); i > 0 ; i--) {
                int number = second.charAt(second.length() - i);
                sum += number;
            }
        }
        return sum;
    }
}
