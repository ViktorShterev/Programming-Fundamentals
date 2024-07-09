package FinalExamPrep2;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder pass = new StringBuilder(input);

        String command = scanner.nextLine();
        while (!command.equals("Generate")) {

            if (command.startsWith("Contains")) {
                String substring = command.split(">>>")[1];
                String text = pass.toString();
                if (text.contains(substring)) {
                    System.out.printf("%s contains %s%n", pass, substring);
                } else {
                    System.out.println("Substring not found!");
                }
            } else if (command.startsWith("Flip")) {
                String upperOrLower = command.split(">>>")[1];
                int startIndex = Integer.parseInt(command.split(">>>")[2]);
                int endIndex = Integer.parseInt(command.split(">>>")[3]);

                String substring = pass.substring(startIndex, endIndex);

                if (upperOrLower.equals("Upper")) {
                    String upper = substring.toUpperCase();
                    pass.replace(startIndex, endIndex, upper);
                } else {
                    String lower = substring.toLowerCase();
                    pass.replace(startIndex, endIndex, lower);
                }
                System.out.println(pass);

            } else if (command.startsWith("Slice")) {
                int startIndex = Integer.parseInt(command.split(">>>")[1]);
                int endIndex = Integer.parseInt(command.split(">>>")[2]);
                pass.delete(startIndex, endIndex);
                System.out.println(pass);
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", pass);
    }
}
