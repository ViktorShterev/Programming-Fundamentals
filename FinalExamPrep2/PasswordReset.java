package FinalExamPrep2;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sbInput = new StringBuilder(input);

        String command = scanner.nextLine();

        while (!command.equals("Done")) {

            if (command.equals("TakeOdd")) {
                StringBuilder newSb = new StringBuilder();
                for (int i = 0; i < sbInput.length(); i++) {
                    if (i % 2 != 0) {
                        String symbol = String.valueOf(sbInput.charAt(i));
                        newSb.append(symbol);
                    }
                }
                sbInput = newSb;
                System.out.println(sbInput);

            } else if (command.startsWith("Cut")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int length = Integer.parseInt(command.split(" ")[2]);

                sbInput.delete(index, index + length);
                System.out.println(sbInput);

            } else if (command.startsWith("Substitute")) {
                String substring = command.split(" ")[1];
                String replacement = command.split(" ")[2];

                String text = sbInput.toString();
                if (text.contains(substring)) {
                    text = text.replace(substring, replacement);
                    sbInput = new StringBuilder(text);
                    System.out.println(sbInput);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", sbInput);
    }
}
