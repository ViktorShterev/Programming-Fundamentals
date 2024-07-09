package FinalExamPrep2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(#|\\|)(?<item>[A-Za-z\\s]+)\\1(?<date>\\d{2}/\\d{2}/\\d{2})\\1(?<calories>\\d{1,5})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        Matcher matcher1 = pattern.matcher(input);

        int sum = 0;

        while (matcher.find()) {

            int calories = Integer.parseInt(matcher.group("calories"));
            sum += calories;
        }
        int days = sum / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);

        while (matcher1.find()) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n", matcher1.group("item"), matcher1.group("date"), matcher1.group("calories"));
        }
    }
}
