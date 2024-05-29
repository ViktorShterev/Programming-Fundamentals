package ObjectsAndClasses.Lab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] textArr = input.split(" ");

        Random rndGenerator = new Random();

        for (int i = 0; i < textArr.length; i++) {

            int index1 = rndGenerator.nextInt(textArr.length);
            int index2 = rndGenerator.nextInt(textArr.length);

            String oldWordIndex1 = textArr[index1];
            textArr[index1] = textArr[index2];
            textArr[index2] = oldWordIndex1;
        }
        System.out.println(String.join(System.lineSeparator(), textArr));
    }
}
