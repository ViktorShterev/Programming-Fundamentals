package Methods.Exercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")){
            isPalindrome(input);

            if (isPalindrome(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }
    public static boolean isPalindrome (String text) {
        String reversed = "";
        for (int index = text.length() - 1; index >= 0; index--) {
            reversed += text.charAt(index);
        }
        return text.equals(reversed);
    }
}
