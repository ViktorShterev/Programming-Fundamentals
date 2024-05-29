package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {
    static class Student {
        String firstName;
        String lastName;
        String age;
        String town;

        public Student(String firstName, String lastName, String age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getTown() {
            return this.town;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setTown(String town) {
            this.town = town;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> studentList = new ArrayList<>();

        while (!input.equals("end")) {

            String[] inputArr = input.split(" ");
            String firstName = inputArr[0];
            String lastName = inputArr[1];
            String age = inputArr[2];
            String town = inputArr[3];

            if (isExistingName(studentList, firstName, lastName)) {
                int index = getIndexExisting(studentList, firstName, lastName);
                studentList.get(index).setAge(age);
                studentList.get(index).setTown(town);

            } else {
                Student current = new Student(firstName, lastName, age, town);
                studentList.add(current);
            }

            input = scanner.nextLine();
        }
        String command = scanner.nextLine();

        for (Student student : studentList) {
            String currentTown = student.getTown();
            if (command.equals(currentTown)) {
                String firstName = student.getFirstName();
                String lastName = student.getLastName();
                String age = student.getAge();
                System.out.printf("%s %s is %s years old\n", firstName, lastName, age);
            }
        }
    }

    static boolean isExistingName(List<Student> studentList, String firstName, String lastName) {
        for (Student student : studentList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    public static int getIndexExisting(List<Student> studentList, String firstName, String lastName) {
        int index = -1;
        for (int i = 0; i < studentList.size(); i++) {
            Student current = studentList.get(i);
            if (current.getFirstName().equals(firstName) && current.getLastName().equals(lastName)) {
                index = i;
            }
        }
        return index;
    }
}
