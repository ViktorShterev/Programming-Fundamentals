package TextProcessing.Exercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (String name : input) {
            if (isValid(name)) {
                System.out.println(name);
            }
        }
    }

    private static boolean isValid(String name) {
        if (name.length() < 3 || name.length() > 16) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            char symbol = name.charAt(i);
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }
        return true;
    }
}


