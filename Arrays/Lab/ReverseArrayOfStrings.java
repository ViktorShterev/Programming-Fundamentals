package Arrays.Lab;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        for (int i = inputArr.length - 1; i >= 0; i--) {
            System.out.printf("%s ", inputArr[i]);
        }

        //String[] inputArr = scanner.nextLine().split(" ");
        for (int i = 0; i < inputArr.length / 2; i++) {
            String oldElement = inputArr[i];
            inputArr[i] = inputArr[inputArr.length - 1 - i];
            inputArr[inputArr.length - 1 - i] = oldElement;
        }
        System.out.println(String.join(" ", inputArr));




    }
}
