package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
            if (i < b) {
                System.out.printf("%d ", i);
            } else {
                System.out.printf("%d\n", i);
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
