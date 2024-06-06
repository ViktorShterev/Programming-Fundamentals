package TextProcessing.Lab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+");

        for (String s : inputArr) {
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s);
            }
        }
    }
}
