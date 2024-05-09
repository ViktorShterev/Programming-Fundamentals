package Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers1 = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numbers2 = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> finalNumbers = new ArrayList<>();

        boolean isFull = false;
        int count = -1;

        while (!isFull) {
            count++;
            if (count >= numbers1.size() && count >= numbers2.size()) {
                isFull = true;
            } else {
                if (count < numbers1.size()) {
                    finalNumbers.add(numbers1.get(count));
                }
                if (count < numbers2.size()) {
                    finalNumbers.add(numbers2.get(count));
                }
            }
        }
                for (Integer finalNumber : finalNumbers) {
                    System.out.print(finalNumber + " ");
                }
            }
        }

