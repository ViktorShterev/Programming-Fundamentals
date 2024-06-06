package TextProcessing.Exercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] codes = input.split("\\s+");

        double sum = 0;

        for (String code : codes) {

            double finalNumber = getNumber(code);
            sum += finalNumber;
        }
        System.out.printf("%.2f", sum);
    }
    public static double getNumber (String code) {

        char firstLetter = code.charAt(0);
        char lastLetter = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(firstLetter, ' ')
                .replace(lastLetter, ' ')
                .trim());

        if (Character.isUpperCase(firstLetter)) {
            int position = firstLetter - 64;
            number /= position;
        } else {
            int position = firstLetter - 96;
            number *= position;
        }
        if (Character.isUpperCase(lastLetter)) {
            int position = lastLetter - 64;
            number -= position;
        } else {
            int position = lastLetter - 96;
            number += position;
        }
        return number;
    }
}
