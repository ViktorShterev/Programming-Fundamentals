package Methods.Exercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        vowels(input);
    }

    public static void vowels(String text) {
        int count = 0;
        for (char symbol : text.toLowerCase().toCharArray()) {
            switch (symbol) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count += 1;
            }
        }
        System.out.println(count);
    }
}

