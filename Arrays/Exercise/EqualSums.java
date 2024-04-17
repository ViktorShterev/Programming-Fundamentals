package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < numArr.length; i++) {
            int sumL = 0;
            int sumR = 0;
            int current = numArr[i];
            for (int j = 0; j < i; j++) {
                sumL += numArr[j];
            }
            for (int k = i + 1; k < numArr.length; k++) {
                sumR += numArr[k];
            }
            if (sumL == sumR){
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");
    }
}
