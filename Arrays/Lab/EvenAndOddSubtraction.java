package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int even = 0;
        int odd = 0;
        int sum = 0;
        String[] inputArr = input.split(" ");
        int[] numArr = new int[inputArr.length];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(inputArr[i]);
            if (numArr[i] % 2 == 0){
                even += numArr[i];
            } else {
                odd += numArr[i];
            }
        }
        sum = even - odd;
        System.out.println(sum);

        /////
        int[] numberArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                        .toArray();
        int oddSum = 0;
        int evenSum = 0;
        for (int item : numberArr){
            if (item % 2 == 0){
                evenSum += item;
            } else {
                oddSum += item;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
