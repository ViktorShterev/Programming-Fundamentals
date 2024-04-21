package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> users = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            String name = command.split(" ")[1];

            if (command.startsWith("register")) {
                String plate = command.split(" ")[2];
                if (users.containsKey(name)) {
                    String current = users.get(name);
                    System.out.printf("ERROR: already registered with plate number %s%n", current);
                } else {
                    users.put(name, plate);
                    System.out.printf("%s registered %s successfully%n", name, plate);
                }
            } else if (command.startsWith("unregister")) {
                if (users.containsKey(name)) {
                    users.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                } else {
                    System.out.printf("ERROR: user %s not found%n", name);
                }
            }
        }
        for (Map.Entry<String, String> entry : users.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}
