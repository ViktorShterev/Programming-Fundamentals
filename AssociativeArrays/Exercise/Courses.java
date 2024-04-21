package AssociativeArrays.Exercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<String>> students = new LinkedHashMap<>();
        while (!input.equals("end")) {

            String course = input.split(" : ")[0];
            String name = input.split(" : ")[1];

            if (!students.containsKey(course)) {
                students.put(course, new ArrayList<>());
            }
            students.get(course).add(name);

            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : students.entrySet()) {
            int size = students.get(entry.getKey()).size();
            List<String> names = entry.getValue();
            System.out.printf("%s: %d%n", entry.getKey(), size);
            System.out.printf("-- %s%n", String.join(System.lineSeparator() + "-- ", names));
        }
    }
}
