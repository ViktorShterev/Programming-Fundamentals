package ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {

    static class Vehicles {
        private String type;
        private String model;
        private String color;
        private int horsePower;

        public Vehicles(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getModel() {
            return this.model;
        }

        public String getType() {
            return this.type;
        }

        public int getHorsePower() {
            return this.horsePower;
        }


        @Override
        public String toString() {
            String formattedType = "";
            if (this.type.equals("car")) {
                formattedType = "Car";
            } else if (this.type.equals("truck")) {
                formattedType = "Truck";
            }

            return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", formattedType, this.model, this.color, this.horsePower);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Vehicles> vehiclesList = new ArrayList<>();
        while (!input.equals("End")) {

            String typeV = input.split(" ")[0];
            String modelV = input.split(" ")[1];
            String colorV = input.split(" ")[2];
            int horsePower = Integer.parseInt(input.split(" ")[3]);

            Vehicles current = new Vehicles(typeV, modelV, colorV, horsePower);
            vehiclesList.add(current);

            input = scanner.nextLine();
        }
        String command = scanner.nextLine();
        while (!command.equals("Close the Catalogue")) {

            for (Vehicles vehicles : vehiclesList) {
                if (command.equals(vehicles.getModel())) {
                    System.out.println(vehicles);
                    break;
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Cars have average horsepower of: %.2f.\n", getAverageHP(vehiclesList, "cars"));
        System.out.printf("Trucks have average horsepower of: %.2f.", getAverageHP(vehiclesList, "trucks"));
    }

    private static double getAverageHP(List<Vehicles> vehiclesList, String type) {
        double sumHP = 0;
        int count = 0;
        if (type.equals("cars")) {
            for (Vehicles vehicles : vehiclesList) {
                if (vehicles.getType().equals("car")) {
                    sumHP += vehicles.getHorsePower();
                    count++;
                }
            }
        } else if (type.equals("trucks")) {
            for (Vehicles vehicles : vehiclesList) {
                if (vehicles.getType().equals("truck")) {
                    sumHP += vehicles.getHorsePower();
                    count++;
                }
            }
        }
        if (sumHP == 0) {
            return 0;
        }
            return sumHP / count;
    }
}

