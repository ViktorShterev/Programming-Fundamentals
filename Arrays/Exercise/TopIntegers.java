package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numArr.length; i++) {
            int current = numArr[i];
            for (int j = i + 1; j < numArr.length; j++) {
                if (max < numArr[j]){
                    max = numArr[j];
                }
            }
            if (i == numArr.length - 1){
                System.out.print(current);
            } else if (current > max){
                System.out.print(current + " ");
            }
            max = 0;
        }
    }
}

