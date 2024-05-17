package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = Integer.parseInt(scanner.nextLine());
        char symbol = scanner.nextLine().charAt(0);
        int secondInput = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.##");
        double endResult = calculate(firstInput, symbol, secondInput);
        System.out.println(df.format(endResult));
    }
    public static double calculate (int a, char operator, int b){
        double result = 0;
        switch (operator){
            case '/':
                result = a * 1.0 / b;
                break;
            case '*':
                result = a * b;
                break;
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
        }
        return result;
    }
}
