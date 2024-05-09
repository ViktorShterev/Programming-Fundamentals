package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDoNotGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;
        while (numbers.size() > 0) {
            int indexRemove = Integer.parseInt(scanner.nextLine());
            if (indexRemove < 0) {
                int num = numbers.get(0);
                numbers.remove(0);
                sum += num;
                int last = numbers.get(numbers.size() - 1);
                numbers.add(0, last);
                modifyList(numbers, num);
            } else if (indexRemove >= numbers.size()) {
                int num = numbers.get(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
                sum += num;
                int first = numbers.get(0);
                numbers.add(first);
                modifyList(numbers, num);
            } else {
                int num = numbers.get(indexRemove);
                sum += num;
                numbers.remove(indexRemove);
                modifyList(numbers, num);
            }
        }
        System.out.println(sum);
    }

    private static void modifyList(List<Integer> numbers, int num) {
        for (int j = 0; j < numbers.size(); j++) {
            int current = 0;
            if (numbers.get(j) <= num) {
                current = numbers.get(j);
                current += num;
                numbers.set(j, current);
            } else {
                current = numbers.get(j);
                current -= num;
                numbers.set(j, current);
            }
        }
    }
}
