package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> phones = Arrays.stream(scanner.nextLine()
                .split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String command = input.split(" - ")[0];
            String phone = input.split(" - ")[1];

            if (command.equals("Add")) {
                if (!phones.contains(phone)) {
                    phones.add(phone);
                }
            } else if (command.equals("Remove")) {
                if (phones.contains(phone)) {
                    phones.remove(phone);
                }
            } else if (command.equals("Bonus phone")) {
                String oldPhone = phone.split(":")[0];
                String newPhone = phone.split(":")[1];
                if (phones.contains(oldPhone)) {
                    int index = phones.indexOf(oldPhone);
                    phones.add(index + 1, newPhone);
                }
            } else if (command.equals("Last")) {
                if (phones.contains(phone)) {
                    phones.remove(phone);
                    phones.add(phone);
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", phones));
    }
}
