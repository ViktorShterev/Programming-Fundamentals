package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        char symbol1 = ' ';
        char symbol2 = ' ';
        char symbol3 = ' ';
        for (int i = 0; i < num; i++) {
            symbol1 = (char) ('a' + i);
            for (int j = 0; j < num; j++) {
                symbol2 = (char) ('a' + j);
                for (int k = 0; k < num; k++) {
                    symbol3 = (char) ('a' + k);
                    System.out.printf("%c%c%c\n", symbol1, symbol2, symbol3);
                }
            }
        }
    }
}
