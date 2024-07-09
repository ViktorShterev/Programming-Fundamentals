package FinalExamPrep2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> matches = new ArrayList<>();

        String regex = "([@|#])(?<word1>[A-Za-z]{3,})\\1([@|#])(?<word2>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int pairs = 0;

        while (matcher.find()) {
            pairs++;

            String word1 = matcher.group("word1");
            String word2 = matcher.group("word2");

            String mirror = "";
            /// String mirror = new StringBuilder (word2).reverse().toString();
            /// и става същото като с фор цикъла
            for (int i = word2.length() - 1; i >= 0; i--) {
                mirror += word2.charAt(i);
            }
            if (mirror.equals(word1)) {
                matches.add(word1 + " <=> " + word2);
            }
        }
        if (pairs == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.println(pairs + " word pairs found!");
        }
        if (matches.size() == 0) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", matches));
        }
    }
}
