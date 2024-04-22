package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double max = Double.MIN_VALUE;
        String best = " ";
        for (int i = 1; i <= num; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > max){
                max = volume;
                best = model;
            }
        }
        System.out.println(best);
    }
}
