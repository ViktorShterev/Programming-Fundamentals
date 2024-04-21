package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String pass = "";
        int count = 0;
        for (int position = name.length() - 1; position >= 0; position--) {
            char currentSymbol = name.charAt(position);
            pass += currentSymbol;
        }
        String input = scanner.nextLine();
        while (!input.equals(pass)){
            count++;
            if (count == 4){
                System.out.printf("User %s blocked!", name);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }
        if (input.equals(pass)){
            System.out.printf("User %s logged in.", name);
        }
    }
}
