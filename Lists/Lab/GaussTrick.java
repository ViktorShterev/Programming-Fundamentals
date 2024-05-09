package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().
                split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.size() > 1) {
                int first = numbers.get(i);
                int last = numbers.get(numbers.size() - 1);
                int sum = first + last;
                System.out.print(sum + " ");
                numbers.remove(i);
                numbers.remove(numbers.size() - 1);
                i = -1;
            } else {
                System.out.println(numbers.get(i));
            }
        }
    }
}
