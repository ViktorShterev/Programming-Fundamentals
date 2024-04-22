package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int powerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionY = Integer.parseInt(scanner.nextLine());
        int pokes = 0;
        int power = powerN;
        while (power >= distanceM) {
            pokes++;
            power -= distanceM;
            if (power == powerN / 2) {
                if (exhaustionY != 0) {
                    power = power / exhaustionY;
                }
            }
        }
        System.out.printf("%d%n%d", power, pokes);
    }
}
