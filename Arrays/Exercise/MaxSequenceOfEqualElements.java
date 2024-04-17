package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int length = 1;
        int best = 0;
        int endIndex = -1;
        for (int i = 0; i < numArr.length - 1; i++) {
            int current = numArr[i];
            int second = numArr[i + 1];
                if (current == second) {
                    length++;
                    if (length > best) {
                        best = length;
                        endIndex = i + 1;
                    }
                } else {
                    length = 1;
                }
            }
        for (int i = endIndex; i > endIndex - best; i--) {
            System.out.print(numArr[i] + " ");
        }
    }
}

