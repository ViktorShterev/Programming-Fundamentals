package Methods.Lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        switch (input){
            case "coffee":
                printCoffee(count);
                break;
            case "water":
                printWater(count);
                break;
            case "coke":
                printCoke(count);
                break;
            case "snacks":
                printSnacks(count);
                break;
            }
        }
    public static void printCoffee(double a){
        System.out.printf("%.2f", a * 1.5);
    }
    public static void printWater(double a){
        System.out.printf("%.2f", a * 1);
    }
    public static void printCoke(double a){
        System.out.printf("%.2f", a * 1.4);
    }
    public static void printSnacks(double a){
        System.out.printf("%.2f", a * 2);
    }
}
