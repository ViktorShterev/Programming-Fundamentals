package TextProcessing.Lab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWord : banWordsArr) {
            String count = "";
            for (int i = 0; i < banWord.length(); i++) {
                count += "*";
            }
            text = text.replace(banWord, count);
        }
        System.out.println(text);
    }
}
