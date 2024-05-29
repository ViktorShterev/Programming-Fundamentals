package ObjectsAndClasses.Exercise;

import java.util.*;

public class OrderByAge {

    static class Person {
        private String name;
        private String id;
        private int age;

        public Person (String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public String getId() {
            return this.id;
        }

        public int getAge() {
            return this.age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Person> personList = new ArrayList<>();

        while (!input.equals("End")) {

            String name = input.split("\\s+")[0];
            String id = input.split("\\s+")[1];
            int age = Integer.parseInt(input.split("\\s+")[2]);

            Person current = new Person(name, id, age);
            personList.add(current);

            input = scanner.nextLine();
        }
        personList.sort(Comparator.comparing(Person::getAge));
        for (Person person : personList) {
            System.out.printf("%s with ID: %s is %d years old.\n", person.getName(), person.getId(), person.getAge());
        }
    }
}
