package FinalExamPrep1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "(::|\\*\\*)(?<emoji>[A-Z][a-z]{2,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> coolEmojis = new ArrayList<>();

        long sumCool = 1;
        for (char symbol : text.toCharArray()) {
            if (Character.isDigit(symbol)) {
                sumCool *= Integer.parseInt(symbol + "");
            }
        }
        System.out.printf("Cool threshold: %d%n", sumCool);

        int matcherCount = 0;
        while (matcher.find()) {
            matcherCount++;
            String emoji = matcher.group("emoji");
            long sum = 0;
            for (int i = 0; i < emoji.length(); i++) {
                sum += emoji.charAt(i);
            }
            if (sum >= sumCool) {
                coolEmojis.add(matcher.group());
            }
        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n", matcherCount);
        System.out.println(String.join(System.lineSeparator(), coolEmojis));
    }
}
