package Methods.Lab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
        if (input.equals("add")){
            addPrint(one, two);
        } else if (input.equals("multiply")){
            multiplyPrint(one, two);
        } else if (input.equals("subtract")){
            subtractPrint(one, two);
        } else if (input.equals("divide")){
            dividePrint(one, two);
        }
    }
    public static void addPrint(int a, int b){
        System.out.printf("%d", a + b);
    }
    public static void multiplyPrint(int a, int b){
        System.out.printf("%d", a * b);
    }
    public static void subtractPrint(int a, int b){
        System.out.printf("%d", a - b);
    }
    public static void dividePrint(int a, int b){
        System.out.printf("%d", a / b);
    }
}
