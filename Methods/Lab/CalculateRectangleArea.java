package Methods.Lab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int widthInput = Integer.parseInt(scanner.nextLine());
        int lengthInput = Integer.parseInt(scanner.nextLine());

        int area = getArea(widthInput, lengthInput);

        System.out.println(area);
    }
    public static int getArea (int width, int length) {
        return width * length;
    }
}
