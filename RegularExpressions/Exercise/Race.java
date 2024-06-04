package RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> runners = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        Map<String, Integer> finishers = new LinkedHashMap<>();
        runners.forEach(runner -> finishers.put(runner, 0));

        String input = scanner.nextLine();

        String regex = "[A-Za-z]";
        Pattern pattern = Pattern.compile(regex);

        String regex2 = "[0-9]";
        Pattern pattern2 = Pattern.compile(regex2);

        while (!input.equals("end of race")) {

            Matcher matcher = pattern.matcher(input);
            StringBuilder sb = new StringBuilder();

            while (matcher.find()) {
                sb.append(matcher.group());
            }

            Matcher matcher2 = pattern2.matcher(input);
            int km = 0;

            while (matcher2.find()) {
                km += Integer.parseInt(matcher.group());
            }

            String name = sb.toString();
            if (runners.contains(name)) {
                int currentKm = finishers.get(name);
                finishers.put(name, currentKm + km);
            }

            input = scanner.nextLine();
        }
        for (int i = 0; i <= 2; i++) {
            String runner = runners.get(i);
            if (i == 0) {
                System.out.println("1st place: " + runner);
            } else if (i == 1) {
                System.out.println("2nd place: " + runner);
            } else if (i == 2) {
                System.out.println("3rd place: " + runner);
            }
        }
    }
}
