package lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Ivan", "Ivanov", 18);
        Student student2 = new Student("Vladimir", "Popovich", 20);
        Student student3 = new Student("Ekaterina", "Sviridova", 19);
        Student student4 = new Student("Maria", "Egorova", 17);
        Student student5 = new Student("Galina", "Knut", 21);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println("Iterations by name:");
        for (Student student : students) {
            System.out.println(student.getFirstName());
        }

        students.sort(new StudentGroupComparator());
        System.out.println(students);
    }
}
