package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        long max = Integer.MIN_VALUE;
        if (num == 0) {
            max = 0;}
        int best = 0;
        int snow = 0;
        int time = 0;
        long value = 0;
        int snowB = 0;
        int timeB = 0;
        for (int i = 1; i <= num; i++) {
            value = 0;
            snow = Integer.parseInt(scanner.nextLine());
            time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());
            int mid = snow / time;
            value = (long) Math.pow(mid, quality);
            if (value > max) {
                max = value;
                best = quality;
                snowB = snow;
                timeB = time;
            }
        }
        System.out.printf("%d : %d = %d (%d)", snowB, timeB, max, best);
    }
}


