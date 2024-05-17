package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberInput = Double.parseDouble(scanner.nextLine());
        int powerInput = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(getRaised(numberInput, powerInput)));
    }
    public static double getRaised (double num, int power){
        return Math.pow(num, power);
    }
}
