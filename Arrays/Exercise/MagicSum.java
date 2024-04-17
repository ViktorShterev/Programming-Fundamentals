package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < input.length; i++) {
            int current = input[i];
            for (int j = i + 1; j < input.length; j++) {
                int second = input[j];
                if (current + second == num){
                    System.out.println(current + " " + second);
                    break;
                }
            }
        }
    }
}
