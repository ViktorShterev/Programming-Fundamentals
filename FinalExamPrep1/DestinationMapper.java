package FinalExamPrep1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> travel = new ArrayList<>();

        String regex = "(=|/)(?<destination>[A-Z][a-zA-Z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int sum = 0;
        while (matcher.find()) {

            String destination = matcher.group("destination");
            int length = destination.length();
            sum += length;
            travel.add(destination);
        }
        System.out.println("Destinations: " + String.join(", ", travel));
        System.out.println("Travel Points: " + sum);
    }
}
