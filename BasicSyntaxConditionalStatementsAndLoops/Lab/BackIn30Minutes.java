package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int sum = (hour * 60) + min + 30;
        int sumHour = sum / 60;
        int sumMin = sum % 60;
        if (sumHour > 23){
            sumHour = 0;
        }
        System.out.printf("%d:%02d", sumHour, sumMin);
    }
}
