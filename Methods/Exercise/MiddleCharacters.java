package Methods.Exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        getMiddle(input);
    }
    public static void getMiddle (String text) {
        if (text.length() % 2 != 0) {
        int index = text.length() / 2;
            System.out.println(text.charAt(index));
        } else {
            int index1 = text.length() / 2 - 1;
            int index2 = text.length() / 2;
            System.out.print(text.charAt(index1));
            System.out.print(text.charAt(index2));
        }
    }
}
