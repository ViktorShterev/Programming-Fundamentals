package Methods.Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String end = result(input, n);
        System.out.println(end);
    }
    public static String result (String str, int count){
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + str;
        }
        return result;
    }
}
