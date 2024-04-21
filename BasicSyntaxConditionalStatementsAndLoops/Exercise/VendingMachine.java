package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double priceSum = 0;
        double coinSum = 0;
        double price = 0;
        double coinFinal = 0;
        while (!input.equals("Start")) {
            double coin = Double.parseDouble(input);
            if (coin != 0.1 && coin != 0.2 && coin != 0.5 && coin != 1 && coin != 2) {
                System.out.printf("Cannot accept %.2f\n", coin);
                coin = 0;
            }
            coinSum += coin;
            coinFinal = coinSum;
            input = scanner.nextLine();
        }
        String input2 = scanner.nextLine();
        while (!input2.equals("End")) {
            coinSum -= price;
            switch (input2) {
                case "Nuts":
                    price = 2;
                    if (coinSum < price) {
                        System.out.println("Sorry, not enough money");
                        price = 0;
                    } else {
                        System.out.printf("Purchased %s\n", input2);
                    }
                    break;
                case "Water":
                    price = 0.7;
                    if (coinSum < price) {
                        System.out.println("Sorry, not enough money");
                        price = 0;
                    } else {
                        System.out.printf("Purchased %s\n", input2);
                    }
                    break;
                case "Crisps":
                    price = 1.5;
                    if (coinSum < price) {
                        System.out.println("Sorry, not enough money");
                        price = 0;
                    } else {
                        System.out.printf("Purchased %s\n", input2);
                    }
                    break;
                case "Soda":
                    price = 0.8;
                    if (coinSum < price) {
                        System.out.println("Sorry, not enough money");
                        price = 0;
                    } else {
                        System.out.printf("Purchased %s\n", input2);
                    }
                    break;
                case "Coke":
                    price = 1;
                    if (coinSum < price) {
                        System.out.println("Sorry, not enough money");
                        price = 0;
                    } else {
                        System.out.printf("Purchased %s\n", input2);
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    price = 0;
                    break;
            }
            priceSum += price;
            input2 = scanner.nextLine();

        }
        if (coinFinal - priceSum >= 0) {
            System.out.printf("Change: %.2f", coinFinal - priceSum);
        } else {
            System.out.print("Change: 0.00");
        }

    }}

