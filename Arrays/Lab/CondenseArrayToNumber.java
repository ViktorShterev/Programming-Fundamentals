package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] condensedArr = new int[numArr.length - 1];
        for (int i = 0; i < numArr.length; i++) {
            if (numArr.length == 1){
                break;
            }
            if (i == numArr.length - 1){
                int[] condensedNew = new int[condensedArr.length - 1];
                i = - 1;
                numArr = condensedArr;
                condensedArr = condensedNew;
            } else {
                condensedArr[i] = numArr[i] + numArr[i + 1];
            }
        }
        System.out.println(numArr[0]);
    }
}
