package FinalExam;

import java.util.Scanner;

public class Hogwarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sbInput = new StringBuilder(input);

        String command = scanner.nextLine();
        while (!command.equals("Abracadabra")) {

            if (command.startsWith("Abjuration")) {
                String text = sbInput.toString();
                text = text.toUpperCase();
                sbInput = new StringBuilder(text);
                System.out.println(sbInput);
            } else if (command.startsWith("Necromancy")) {
                String text = sbInput.toString();
                text = text.toLowerCase();
                sbInput = new StringBuilder(text);
                System.out.println(sbInput);
            } else if (command.startsWith("Illusion")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                String letter = command.split(" ")[2];

                if (index >= 0 && index < sbInput.length()) {
                    sbInput.replace(index, index + 1, letter);
                    System.out.println("Done!");
                } else {
                    System.out.println("The spell was too weak.");
                }
            } else if (command.startsWith("Divination")) {
                String firstSubstring = command.split(" ")[1];
                String secondSubstring = command.split(" ")[2];

                String text = sbInput.toString();

                if (text.contains(firstSubstring)) {
                    text = text.replace(firstSubstring, secondSubstring);
                    sbInput = new StringBuilder(text);
                    System.out.println(sbInput);
                }
            } else if (command.startsWith("Alteration")) {
                String substring = command.split(" ")[1];

                String text = sbInput.toString();

                if (text.contains(substring)) {
                    text = text.replace(substring, "");
                    sbInput = new StringBuilder(text);
                    System.out.println(sbInput);
                }
            } else {
                System.out.println("The spell did not work!");
            }
                command = scanner.nextLine();
            }
        }
    }
