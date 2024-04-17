package Arrays.Exercise;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String firstElement = input[0];
            for (int index = 0; index < input.length - 1; index++) {
                input[index] = input[index + 1];
            }
            input[input.length - 1] = firstElement;
        }
        for (String element : input) {
            System.out.print(element + " ");
        }
    }
}
