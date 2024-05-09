package Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();

            if (command.contains("is going!")) {
                String name = command.split(" ")[0];
                if (names.contains(name)) {
                    System.out.printf("%s is already in the list!\n", name);
                } else {
                    names.add(name);
                }
            } else if (command.contains("is not going!")) {
                String name = command.split(" ")[0];
                if (!names.contains(name)) {
                    System.out.printf("%s is not in the list!\n", name);
                } else {
                    names.remove(name);
                }
            }
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
