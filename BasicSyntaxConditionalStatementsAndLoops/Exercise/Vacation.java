package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        double sum = 0;
        switch (group){
            case "Students":
                if (day.equals("Friday")){
                    price = 8.45;
                } else if (day.equals("Saturday")){
                    price = 9.8;
                } else if (day.equals("Sunday")){
                    price = 10.46;
                }
                sum = num * price;
                if (num >= 30){
                   sum = sum - (sum * 0.15);
                }
                break;
            case "Business":
                if (day.equals("Friday")){
                    price = 10.9;
                } else if (day.equals("Saturday")){
                    price = 15.6;
                } else if (day.equals("Sunday")){
                    price = 16;
                }
                sum = num * price;
                if (num >= 100){
                    sum = sum - 10 * price;
                }
                break;
            case "Regular":
                if (day.equals("Friday")){
                    price = 15;
                } else if (day.equals("Saturday")){
                    price = 20;
                } else if (day.equals("Sunday")){
                    price = 22.5;
                }
                sum = num * price;
                if (num >= 10 && num <= 20){
                    sum = sum - sum * 0.05;
                }
                break;
        }
        System.out.printf("Total price: %.2f", sum);
    }
}
