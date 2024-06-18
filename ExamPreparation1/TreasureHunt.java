package ExamPreparation1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lootsArr = scanner.nextLine().split("\\|");
        List<String> lootsList = new ArrayList<>(Arrays.asList(lootsArr));

        List<String> commandList = Arrays.asList(scanner.nextLine().split(" "));
        while (!commandList.contains("Yohoho!")) {

            String command = commandList.get(0);

            switch (command) {
                case "Loot":
                    List<String> commandParts = commandList.subList(1, commandList.size());
                    for (String item : commandParts) {
                        if (!lootsList.contains(item)) {
                            lootsList.add(0, item);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandList.get(1));
                    if (index >= 0 && index < lootsList.size()) {
                        String remove = lootsList.get(index);
                        lootsList.remove(remove);
                        lootsList.add(remove);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(commandList.get(1));
                    List<String> stealItems = new ArrayList<>();
                    int result = lootsList.size() - count;
                    if (result >= 0) {
                        for (int i = result; i < lootsList.size(); i++) {
                            String element = lootsList.get(i);
                            stealItems.add(element);
                        }
                    } else {
                        for (int i = 0; i < lootsList.size(); i++) {
                            String element = lootsList.get(i);
                            stealItems.add(element);
                        }
                    }
                    System.out.println(String.join(", ", stealItems));
                    lootsList.removeAll(stealItems);
                    break;
            }
            commandList = Arrays.asList(scanner.nextLine().split(" "));
        }
        if (lootsList.size() > 0) {
            int sum = 0;
            for (String loots : lootsList) {
                int length = loots.length();
                sum += length;
            }
            double result = sum * 1.0 / lootsList.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", result);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}

