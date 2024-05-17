package Methods.Exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int result = smallest(num1, num2, num3);
        System.out.println(result);
    }

    public static int smallest(int first, int second, int third){
        int smallest = Integer.MAX_VALUE;
        if (first < smallest){
            smallest = first;
        }
        if (second < smallest){
            smallest = second;
        }
        if (third < smallest){
            smallest = third;
        }
        return smallest;
    }
}
