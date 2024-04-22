package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int current = num;
        while (current > 0){
            sum += current % 10;
            current = current / 10;
        }
        System.out.println(sum);
    }
}
