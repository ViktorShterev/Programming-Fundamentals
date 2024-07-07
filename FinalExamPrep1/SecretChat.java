package FinalExamPrep1;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        StringBuilder sbMessage = new StringBuilder(message);

        String command = scanner.nextLine();
        while (!command.equals("Reveal")) {
            boolean isError = false;

            if (command.startsWith("InsertSpace")) {
                int index = Integer.parseInt(command.split(":\\|:")[1]);
                sbMessage.insert(index, " ");
            } else if (command.startsWith("Reverse")) {
                String substring = command.split(":\\|:")[1];
                String text = sbMessage.toString();
                if (text.contains(substring)) {
                    int first = sbMessage.indexOf(substring);
                    int last = first + substring.length();
                    sbMessage.replace(first, last + 1, "");
                    substring = new StringBuilder(substring).reverse().toString();
                    sbMessage = new StringBuilder(sbMessage).append(substring);
                } else {
                    System.out.println("error");
                    isError = true;
                }
            } else if (command.startsWith("ChangeAll")) {
                String oldWord = command.split(":\\|:")[1];
                String newWord = command.split(":\\|:")[2];
                String text = sbMessage.toString();
                text = text.replace(oldWord, newWord);
                sbMessage = new StringBuilder(text);
            }
            if (!isError) {
                System.out.println(sbMessage);
            }
            command = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", sbMessage);
    }
}
