package AssociativeArrays.Exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> students = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!students.containsKey(name)) {
                students.put(name, new ArrayList<>());
            }
            students.get(name).add(grade);
        }
        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            List<Double> average = entry.getValue();
            double grade = 0;
            for (Double aDouble : average) {
                grade += aDouble;
            }
            double finalSum = grade / average.size();
            if (finalSum >= 4.5) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), finalSum);
            }
        }
    }
}
