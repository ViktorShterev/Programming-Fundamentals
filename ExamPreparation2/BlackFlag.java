package ExamPreparation2;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysPlunder = Integer.parseInt(scanner.nextLine());
        int plunderPerDay = Integer.parseInt(scanner.nextLine());
        double expected = Double.parseDouble(scanner.nextLine());
        double sum = 0;
        for (int i = 1; i <= daysPlunder; i++) {
            sum += plunderPerDay;
            if (i % 3 == 0) {
                sum = sum + plunderPerDay * 1.0 / 2;
            }
            if (i % 5 == 0) {
                sum = sum - sum * 0.3;
            }
        }
        if (sum >= expected) {
            System.out.printf("Ahoy! %.2f plunder gained.", sum);
        } else {
            double left = (sum / expected) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.",left);
        }
    }
}
