package TextProcessing.Exercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder(input);

        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);

            if (current == '>') {
                int power = Integer.parseInt(String.valueOf(text.charAt(i + 1)));
                sum += power;
            } else if (current != '>' && sum > 0) {
                text.deleteCharAt(i);
                sum--;
                i--;
            }
        }
        System.out.println(text);
    }
}
