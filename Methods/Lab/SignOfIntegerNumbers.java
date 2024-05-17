package Methods.Lab;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        printNumSign(num);
    }

    public static void printNumSign(int num) {
        if (num > 0) {
            System.out.printf("The number %d is positive.\n", num);
        } else if (num < 0) {
            System.out.printf("The number %d is negative.\n", num);
        } else {
            System.out.printf("The number %d is zero.\n", num);
        }
    }
}
