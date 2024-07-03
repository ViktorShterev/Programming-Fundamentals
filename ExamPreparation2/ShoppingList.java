package ExamPreparation2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> products = Arrays.stream(scanner.nextLine()
                        .split("!"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")) {

            if (command.startsWith("Urgent")) {
                String item = command.split(" ")[1];
                if (!products.contains(item)) {
                    products.add(0, item);
                }
            } else if (command.startsWith("Unnecessary")) {
                String item = command.split(" ")[1];
                if (products.contains(item)) {
                    products.remove(item);
                }
            } else if (command.startsWith("Correct")) {
                String itemOld = command.split(" ")[1];
                String itemNew = command.split(" ")[2];
                if (products.contains(itemOld)) {
                    int index = products.indexOf(itemOld);
                    products.set(index, itemNew);
                }
            } else if (command.startsWith("Rearrange")) {
                String item = command.split(" ")[1];
                if (products.contains(item)) {
                    int index = products.indexOf(item);
                    String current = products.get(index);
                    products.remove(item);
                    products.add(current);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", products));
    }
}
