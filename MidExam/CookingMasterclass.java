package MidExam;

import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceFlour = Double.parseDouble(scanner.nextLine());
        double pricePerEgg = Double.parseDouble(scanner.nextLine());
        double priceApron = Double.parseDouble(scanner.nextLine());

        double sum = 0;
        int countApron = 0;
        for (int i = 1; i <= students; i++) {
            double perStudent = priceFlour + pricePerEgg * 10 + priceApron;
            if (i % 5 == 0) {
                perStudent -= priceFlour;
            }
            sum += perStudent;
            countApron++;
        }
        double sumApron = countApron * 0.2;
        sum += Math.ceil(sumApron) * priceApron;
        if (budget >= sum) {
            System.out.printf("Items purchased for %.2f$.", sum);
        } else {
            System.out.printf("%.2f$ more needed.", sum - budget);
        }
    }
}
