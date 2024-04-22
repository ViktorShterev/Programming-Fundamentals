package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pass = Integer.parseInt(scanner.nextLine());
        double capacity = Double.parseDouble(scanner.nextLine());
        double courses = pass / capacity;
        System.out.printf("%.0f", Math.ceil(courses));
    }
}
