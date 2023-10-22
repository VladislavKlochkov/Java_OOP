package lesson5.view;

import lesson5.controller.Controller;
import lesson5.model.Student;
import lesson5.model.User;

import java.util.List;

public class StudentView {

    public void showStudent(List<Student> students) {
        System.out.println("List of students: ");
        for (Student student : students) {
            System.out.println(student.getStudentId() + student.getLastName());
        }
    }
}
