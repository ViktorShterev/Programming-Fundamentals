package Arrays.Exercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");
            for (String second : secondArr) {
                for (String first : firstArr) {
                    if (first.equals(second)){
                        System.out.printf("%s ", second);
                        break;
                }
            }
        }
    }
}
