package Methods.Exercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char one = scanner.nextLine().charAt(0);
        char two = scanner.nextLine().charAt(0);

        printCharBetween(one, two);
    }
    public static void printCharBetween (char a, char b){
        if (a >= b) {
            for (int i = b + 1; i < a; i++) {
                char symbol = (char) i;
                System.out.print(symbol + " ");
            }
        } else {
        for (int i = a + 1; i < b; i++) {
            char symbol = (char) i;
            System.out.print(symbol + " ");
        }
    }
}
}
