package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tank = 255;
        int sum = 0;
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= count; i++) {
            int last = 0;
            int liter = Integer.parseInt(scanner.nextLine());
            sum += liter;
            last = liter;
            if (sum > tank){
                System.out.println("Insufficient capacity!");
                sum = sum - last;
            }
        }
        System.out.println(sum);
    }
}
