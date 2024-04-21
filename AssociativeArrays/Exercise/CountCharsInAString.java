package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Map<Character, Integer> characterCounts = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (characterCounts.containsKey(symbol)) {
                characterCounts.put(symbol, characterCounts.get(symbol) + 1);
            } else {
                characterCounts.put(symbol, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : characterCounts.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
