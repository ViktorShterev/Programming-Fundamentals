package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= num * 2; i++) {
            if (i % 2 != 0){
                sum += i;
                System.out.println(i);
            }}
        System.out.printf("Sum: %d", sum);
    }
}


