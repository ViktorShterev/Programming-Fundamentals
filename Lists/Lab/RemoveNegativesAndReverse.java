package Lists.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> positiveNumbers = new ArrayList<>();

        for (int num : numbers) {
            if (num >= 0) {
                positiveNumbers.add(num);
            }
        }
        Collections.reverse(positiveNumbers);

        if (positiveNumbers.size() == 0) {
            System.out.println("empty");
        } else {
            System.out.println(positiveNumbers.toString()
                    .replace("[", "")
                    .replace("]", "")
                    .replaceAll(",", ""));


            ///for (int number : positiveNumbers) {
            //            System.out.print(number + " ");
        }
    }
}
