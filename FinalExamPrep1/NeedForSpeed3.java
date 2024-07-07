package FinalExamPrep1;

import java.util.*;

public class NeedForSpeed3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> cars = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String car = input[0];
            int mileage = Integer.parseInt(input[1]);
            int fuel = Integer.parseInt(input[2]);

            cars.put(car, new ArrayList<>());
            cars.get(car).add(0, mileage);
            cars.get(car).add(1, fuel);
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String carChanging = command.split(" : ")[1];

            if (command.startsWith("Drive")) {
                int distance = Integer.parseInt(command.split(" : ")[2]);
                int fuelNeeded = Integer.parseInt(command.split(" : ")[3]);
                int currentFuel = cars.get(carChanging).get(1);
                int currentKm = cars.get(carChanging).get(0);
                if (fuelNeeded > currentFuel) {
                    System.out.println("Not enough fuel to make that ride");
                } else {
                    cars.get(carChanging).set(0, currentKm + distance);
                    cars.get(carChanging).set(1, currentFuel - fuelNeeded);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", carChanging, distance, fuelNeeded);
                }
                if (cars.get(carChanging).get(0) >= 100000) {
                    cars.remove(carChanging);
                    System.out.printf("Time to sell the %s!%n", carChanging);
                }

            } else if (command.startsWith("Refuel")) {
                int fuelTanking = Integer.parseInt(command.split(" : ")[2]);
                int current = cars.get(carChanging).get(1);
                cars.get(carChanging).set(1, current + fuelTanking);
                if (cars.get(carChanging).get(1) > 75) {
                    cars.get(carChanging).set(1, 75);
                }
                System.out.printf("%s refueled with %d liters%n", carChanging, cars.get(carChanging).get(1) - current);

            } else if (command.startsWith("Revert")) {
                int km = Integer.parseInt(command.split(" : ")[2]);
                int current = cars.get(carChanging).get(0);
                cars.get(carChanging).set(0, current - km);
                if (cars.get(carChanging).get(0) < 10000) {
                    cars.get(carChanging).set(0, 10000);
                } else {
                    System.out.printf("%s mileage decreased by %d kilometers%n", carChanging, km);
                }
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<Integer>> entry : cars.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }
    }
}
