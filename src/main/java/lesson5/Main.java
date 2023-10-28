package lesson5;

import lesson5.model.Student;
import lesson5.model.StudentGroup;
import lesson5.model.Teacher;
import lesson5.model.User;
import lesson5.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User student1 = new Student("Ivanov", "Ivan", "2005", 1L);
        User student2 = new Student("Petrov", "Petr", "2004", 451L);
        User student3 = new Student("Sidorov", "Vasiliy", "2005", 45L);
        User student4 = new Student("Egorov", "Egor", "2004", 535L);
        User student5 = new Student("Kalinina", "Svetlana", "2006", 546465L);

        User teacher = new Teacher("Vetrova", "Irina", "1975", 1528L);

        List<Student> students = new ArrayList<>();

        StudentGroup studentsGroup = new StudentGroup((Teacher) teacher, students);
        studentsGroup.addStudent(student1);
        studentsGroup.addStudent(student2);
        studentsGroup.addStudent(student3);
        studentsGroup.addStudent(student4);
        studentsGroup.addStudent(student5);

        System.out.println(studentsGroup);
    }
}
