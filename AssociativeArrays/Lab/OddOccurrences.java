package AssociativeArrays.Lab;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Map<String, Integer> count = new LinkedHashMap<>();

        for (String word : words) {
            String newWord = word.toLowerCase();

            if (count.containsKey(newWord)) {
                count.put(newWord, count.get(newWord) + 1);
            } else {
                count.put(newWord, 1);
            }
        }

        List<String> wordsList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            int times = entry.getValue();
            if (times % 2 != 0) {
                wordsList.add(entry.getKey());
            }
        }
            System.out.print(String.join(", ", wordsList));
    }
}
