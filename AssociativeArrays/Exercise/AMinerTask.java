package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Integer> countElement = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            int count = Integer.parseInt(scanner.nextLine());

            if (!countElement.containsKey(input)) {
                countElement.put(input, count);
            } else {
                countElement.put(input, countElement.get(input) + count);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : countElement.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }
    }
}
