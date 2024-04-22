package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        char symbol = ' ';
        for (int i = num1; i <= num2; i++) {
            symbol = (char) i;
            System.out.printf("%c ", symbol);
        }
    }
}
