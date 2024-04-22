package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        int pop = Integer.parseInt(scanner.nextLine());
        int skm = Integer.parseInt(scanner.nextLine());
        System.out.printf("Town %s has population of %d and area %d square km.", city, pop, skm);
    }
}
