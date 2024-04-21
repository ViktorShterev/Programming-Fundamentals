package AssociativeArrays.Exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> workers = new LinkedHashMap<>();

        boolean isEqual = false;

        while (!input.equals("End")) {
            String company = input.split(" -> ")[0];
            String name = input.split(" -> ")[1];

            if (!workers.containsKey(company)) {
                workers.put(company, new ArrayList<>());
                workers.get(company).add(name);
            } else {
                for (String id : workers.get(company)) {
                    if (name.equals(id)) {
                        isEqual = true;
                        break;
                    }
                }
                if (!isEqual) {
                    workers.get(company).add(name);
                }
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : workers.entrySet()) {
            List<String> names = entry.getValue();
            System.out.println(entry.getKey());
            System.out.printf("-- %s%n", String.join(System.lineSeparator() + "-- ", names));
        }
    }
}
