package ObjectsAndClasses.Exercise.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();

            String[] inputArr = input.split(" ");

            String name = inputArr[0];
            int age = Integer.parseInt(inputArr[1]);

            if (age > 30) {
                Person person = new Person(name, age);
                personList.add(person);
            }
        }
        for (Person person : personList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
