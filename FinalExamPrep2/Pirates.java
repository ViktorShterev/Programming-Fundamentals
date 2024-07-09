package FinalExamPrep2;

import java.util.*;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<Integer>> targets = new LinkedHashMap<>();

        while (!input.equals("Sail")) {

            String city = input.split("\\|\\|")[0];
            int population = Integer.parseInt(input.split("\\|\\|")[1]);
            int gold = Integer.parseInt(input.split("\\|\\|")[2]);

            if (targets.containsKey(city)) {
                int currentPop = targets.get(city).get(0);
                int currentGold = targets.get(city).get(1);
                targets.get(city).set(0, currentPop + population);
                targets.get(city).set(1, currentGold + gold);
            } else {
                targets.put(city, new ArrayList<>());
                targets.get(city).add(0, population);
                targets.get(city).add(1, gold);
            }
            input = scanner.nextLine();
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String town = command.split("=>")[1];

            if (command.startsWith("Plunder")) {
                int people = Integer.parseInt(command.split("=>")[2]);
                int stolenGold = Integer.parseInt(command.split("=>")[3]);

                int currentPop = targets.get(town).get(0);
                int currentGold = targets.get(town).get(1);

                    targets.get(town).set(0, currentPop - people);
                    targets.get(town).set(1, currentGold - stolenGold);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, stolenGold, people);

                if (currentPop - people <= 0 || currentGold - stolenGold <= 0) {
                    targets.remove(town);
                    System.out.printf("%s has been wiped off the map!%n", town);
                }
            } else if (command.startsWith("Prosper")) {
                int increaseGold = Integer.parseInt(command.split("=>")[2]);
                if (increaseGold <= 0) {
                    System.out.println("Gold added cannot be a negative number!");
                } else {
                    int currentGold = targets.get(town).get(1);
                    targets.get(town).set(1, currentGold + increaseGold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", increaseGold, town, currentGold + increaseGold);
                }
            }
            command = scanner.nextLine();
        }
        if (targets.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", targets.size());
            for (Map.Entry<String, List<Integer>> entry : targets.entrySet()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
            }
        }
    }
}
