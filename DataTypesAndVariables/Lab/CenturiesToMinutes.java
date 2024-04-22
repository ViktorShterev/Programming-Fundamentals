package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int years = num * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double min = hours * 60;
        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes", num, years, days, hours, min);
    }
}
