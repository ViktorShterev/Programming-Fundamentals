package ExamPreparation2;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i);
            sum += current;
        }
        double average = sum * 1.0 / numbers.size();
        List<Integer> greater = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int current1 = numbers.get(i);
            if (current1 > average) {
                greater.add(current1);
            }
        }
        if (greater.size() == 0) {
            System.out.println("No");
        } else {
            Collections.sort(greater);
            Collections.reverse(greater);
            if (greater.size() > 5) {
                List<Integer> finals = greater.subList(0, 5);
                for (Integer aFinal : finals) {
                    System.out.print(aFinal + " ");
                }
            } else {
                for (Integer integer : greater) {
                    System.out.print(integer + " ");
                }
            }
        }
    }
}
