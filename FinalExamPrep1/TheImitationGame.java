package FinalExamPrep1;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder code = new StringBuilder(input);

        String command = scanner.nextLine();

        while (!command.equals("Decode")) {

            if (command.startsWith("Move")) {
                int moves = Integer.parseInt(command.split("\\|")[1]);
                String firstLetters = code.substring(0, moves);
                code.delete(0, moves);
                code.append(firstLetters);
            } else if (command.startsWith("Insert")) {
                int index = Integer.parseInt(command.split("\\|")[1]);
                String value = command.split("\\|")[2];
                code.insert(index, value);
            } else if (command.startsWith("ChangeAll")) {
                String substring = command.split("\\|")[1];
                String replacement = command.split("\\|")[2];
                String newCode = code.toString();
                newCode = newCode.replace(substring, replacement);
                code = new StringBuilder(newCode);
            }
            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + code);
    }
}
