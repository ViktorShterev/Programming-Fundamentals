package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yields = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int spices = 0;
        int sum = 0;
        while (yields >= 100) {
            count++;
            spices = yields - 26;
            yields -= 10;
            sum += spices;
        }
            sum -= 26;
        if (sum < 0){
            sum = 0;
        }
            System.out.printf("%d%n%d", count, sum);
        }
    }

