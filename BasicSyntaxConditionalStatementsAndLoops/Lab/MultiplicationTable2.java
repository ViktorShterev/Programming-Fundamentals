package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = num2; i <= 10; i++) {
            sum = num1 * i;
            System.out.printf("%d X %d = %d\n", num1, i, sum);
        }
        if (num2 > 10){
            sum = num1 * num2;
            System.out.printf("%d X %d = %d", num1, num2, sum);
        }
    }
}
