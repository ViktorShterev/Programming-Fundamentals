package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();

            String regex = "(\\|)(?<name>[A-Z]{4,})\\1:#(?<title>[A-Za-z]+[\\s][A-Za-z]+)#";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String name = matcher.group("name");
                String title = matcher.group("title");

                int strength = name.length();
                int armor = title.length();

                System.out.printf("%s, The %s%n", name, title);
                System.out.printf(">> Strength: %d%n", strength);
                System.out.printf(">> Armor: %d%n", armor);
            } else {
                System.out.println("Access denied!");
            }
        }
    }
}
