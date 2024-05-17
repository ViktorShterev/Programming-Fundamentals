package Methods.Exercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            if (isDividedBy8(i) && isOdd(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isDividedBy8(int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num = num / 10;
        }
        if (sum % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isOdd (int num) {
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                num = num / 10;
            }
        }
        return false;
    }
}
