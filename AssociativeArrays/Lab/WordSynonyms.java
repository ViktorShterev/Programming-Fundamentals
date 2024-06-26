package AssociativeArrays.Lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<String>> words = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!words.containsKey(word)) {
                words.put(word, new ArrayList<>());
            }
            words.get(word).add(synonym);
        }
        for (Map.Entry<String, ArrayList<String>> entry : words.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
