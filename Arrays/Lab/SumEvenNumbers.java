package Arrays.Lab;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sum = 0;
        String[] inputArr = input.split(" ");
        int[] numArr = new int[inputArr.length];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(inputArr[i]);
            if (numArr[i] % 2 == 0){
                sum += numArr[i];
            }
        }
        System.out.println(sum);
    }
}
