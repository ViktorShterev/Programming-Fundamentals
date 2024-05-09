package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {

            if (command.startsWith("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                if (startIndex < 0) {
                    startIndex = 0;

                } else if (endIndex >= input.size()) {
                    endIndex = input.size() - 1;
                }
                if (startIndex >= 0 && startIndex < input.size() && endIndex >= 0 && endIndex < input.size()) {
                    String mergeText = "";
                    for (int i = startIndex; i <= endIndex; i++) {
                        String current = input.get(i);
                        mergeText += current;
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        input.remove(startIndex);
                    }
                    input.add(startIndex, mergeText);
                }
            } else if (command.startsWith("divide")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int partitions = Integer.parseInt(command.split(" ")[2]);

                if (index >= 0 && index < input.size()) {
                    String text = input.get(index);
                    input.remove(index);

                    int countSymbols = text.length() / partitions;

                    int beginIndex = 0;

                    for (int i = 1; i < partitions; i++) {
                        String newText = text.substring(beginIndex, beginIndex + countSymbols);
                        input.add(index, newText);
                        index++;
                        beginIndex += countSymbols;
                    }
                    String lastText = text.substring(beginIndex, text.length());
                    input.add(index, lastText);
                }
            }
            command = scanner.nextLine();
        }
        ////System.out.println(String.join(" ", input));

        for (String s : input) {
            System.out.print(s + " ");
        }
    }
}
