package FinalExamPrep2;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();
        StringBuilder sb = new StringBuilder(stops);

        String command = scanner.nextLine();

        while (!command.equals("Travel")) {

            if (command.startsWith("Add Stop")) {
                int index = Integer.parseInt(command.split(":")[1]);
                String string = command.split(":")[2];
                if (index < sb.length()) {
                    sb.insert(index, string);
                }
            } else if (command.startsWith("Remove Stop")) {
                int startIndex = Integer.parseInt(command.split(":")[1]);
                int endIndex = Integer.parseInt(command.split(":")[2]);
                if (startIndex < sb.length() && endIndex < sb.length()) {
                    sb.delete(startIndex, endIndex + 1);
                }
            } else if (command.startsWith("Switch")) {
                String oldString = command.split(":")[1];
                String newString = command.split(":")[2];
                String text = sb.toString();
                if (text.contains(oldString)) {
                    text = text.replace(oldString, newString);
                }
                sb = new StringBuilder(text);
            }
            System.out.println(sb);
            command = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + sb);
    }
}
