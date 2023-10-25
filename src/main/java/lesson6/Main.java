package lesson6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Ivan", "Ivanov", 22);
        Student student2 = new Student("Vladimir", "Petrov", 21);
        Student student3 = new Student("Kitty", "Monson", 23);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        StudentView studentView = new StudentView();
        studentView.print(students);
    }
}
