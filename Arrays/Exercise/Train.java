package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numArr = new int[n];
        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(scanner.nextLine());
            sum += numArr[i];
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.printf("%d ", numArr[i]);
        }
        System.out.printf("%n%d",sum);
    }
}
