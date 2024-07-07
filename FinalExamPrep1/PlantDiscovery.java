package FinalExamPrep1;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> plantsMap = new LinkedHashMap<>();
        Map<String, List<Double>> ratings = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String [] plants = scanner.nextLine().split("<->");
            String plant = plants[0];
            String rarity = plants[1];
            plantsMap.put(plant, rarity);
            ratings.put(plant, new ArrayList<>());
            ratings.get(plant).add(0, 0.0);
            ratings.get(plant).add(1, 0.0);
        }

        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {

            String info = command.split(": ")[1];
            String plant = info.split(" - ")[0];

            if (command.startsWith("Rate")) {
                double rating = Double.parseDouble(info.split(" - ")[1]);
                if (plantsMap.containsKey(plant)) {
                    double oldRating = ratings.get(plant).get(0);
                    double oldCount = ratings.get(plant).get(1);
                    ratings.get(plant).set(0, oldRating + rating);
                    ratings.get(plant).set(1, oldCount + 1);
                } else {
                    System.out.println("error");
                }
            } else if (command.startsWith("Update")) {
                String newRarity = info.split(" - ")[1];
                if (plantsMap.containsKey(plant)) {
                    plantsMap.put(plant, newRarity);
                } else {
                    System.out.println("error");
                }
            } else if (command.startsWith("Reset")) {
                if (plantsMap.containsKey(plant)) {
                    ratings.get(plant).set(0, 0.0);
                    ratings.get(plant).set(1, 0.0);
                } else {
                    System.out.println("error");
                }
            }
            command = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, String> entry : plantsMap.entrySet()) {
            String name = entry.getKey();
            String rarity = entry.getValue();
            double rating = ratings.get(name).get(0);
            double count = ratings.get(name).get(1);
            double average = 0;
            if (rating == 0 || count == 0) {
                average = 0;
            } else {
                average = rating / count;
            }

            System.out.printf("- %s; Rarity: %s; Rating: %.2f%n", name, rarity, average);
        }
    }
}
