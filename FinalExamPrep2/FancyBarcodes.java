package FinalExamPrep2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();

            String regex = "(@#+)(?<text>[A-Z][A-Za-z0-9]{4,}[A-Z])(@[#]{1,})";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String text = matcher.group("text");
                String barcode = "";
                for (int j = 0; j < text.length(); j++) {
                    if (Character.isDigit(text.charAt(j))) {
                        barcode += text.charAt(j);
                    }
                }
                if (barcode.length() == 0) {
                    barcode = "00";
                }
                System.out.printf("Product group: %s%n", barcode);
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
