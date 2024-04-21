package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int games = Integer.parseInt(scanner.nextLine());
        double headsetP = Double.parseDouble(scanner.nextLine());
        double mouseP = Double.parseDouble(scanner.nextLine());
        double keyboardP = Double.parseDouble(scanner.nextLine());
        double displayP = Double.parseDouble(scanner.nextLine());
        double hP = 0;
        double mP = 0;
        double kP = 0;
        double dP = 0;
        int count = 0;
        for (int i = 1; i <= games; i++) {
            if (i % 2 == 0) {
                hP += headsetP;
            }
            if (i % 3 == 0) {
                mP += mouseP;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                kP += keyboardP;
                count++;
                if (count % 2 == 0) {
                    dP += displayP;
                }
            }
        }
        double sum = hP + mP + kP + dP;
        System.out.printf("Rage expenses: %.2f lv.", sum);
    }
}
