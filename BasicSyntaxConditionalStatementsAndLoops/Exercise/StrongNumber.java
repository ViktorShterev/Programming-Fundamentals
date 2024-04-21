package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sumFact = 0;
        int startNum = num;
        while (num > 0){
            int sum = 1;
            int lastDigit = num % 10;
            for (int i = 1; i <= lastDigit; i++) {
                sum *= i;
            }
            sumFact += sum;
            num = num / 10;
        }
        if (sumFact == startNum){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
