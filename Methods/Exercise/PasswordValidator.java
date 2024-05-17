package Methods.Exercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        boolean isLength = isValidLength(input);
        if (!isLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isContent = isValidContent(input);
        if (!isContent) {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isValidDigits = isValidCountDigits(input);
        if (!isValidDigits) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isLength && isContent && isValidDigits) {
            System.out.println("Password is valid");
        }

    }
    public static boolean isValidLength (String password) {
        return password.length() >= 6 && password.length() <= 10;
    }
    public static boolean isValidContent (String password) {
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isValidCountDigits (String password) {
        int count = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                count++;
            }
        }
        return count >= 2;
    }
}
