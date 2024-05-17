package Methods.Lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type){
            case "int":
                int first = Integer.parseInt(scanner.nextLine());
                int second = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(first, second));
                break;
            case "char":
                char firstC = scanner.nextLine().charAt(0);
                char secondC = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstC, secondC));
                break;
            case "string":
                String firstS = scanner.nextLine();
                String secondS = scanner.nextLine();
                System.out.println(getMax(firstS, secondS));
                break;
        }
    }
    public static int getMax (int a, int b){
        if (a > b){
            return a;
        } else {
            return b;
        }
    }
    public static char getMax (char a, char b){
        if (a > b){
            return a;
        } else {
            return b;
        }
    }
    public static String getMax (String a, String b){
        if (a.compareTo(b) > 0){
            return a;
        } else {
            return b;
        }
    }
}
