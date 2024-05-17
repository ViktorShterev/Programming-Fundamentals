package Methods.Exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        long fact1 = getFactorial(first);

        long fact2 = getFactorial(second);

        double sum = fact1 * 1.0 / fact2;

        System.out.printf("%.2f", sum);
    }
    public static long getFactorial (int number){
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}
