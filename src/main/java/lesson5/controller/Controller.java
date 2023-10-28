package lesson5.controller;

import lesson5.model.Student;
import lesson5.model.StudentGroup;
import lesson5.model.Teacher;
import lesson5.model.User;
import lesson5.service.DataService;
import lesson5.service.StudentGroupService;
import lesson5.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private DataService dataService;
    private StudentGroupService studentGroupService;

    public Controller() {
        dataService = new DataService();
        studentGroupService = new StudentGroupService();
    }

    public List<User> createStudent(String lastName, String firstName, String birthYear) {
        return dataService.createStudent(lastName, firstName, birthYear);
    }

    public List<User> createTeacher(String lastName, String firstName, String birthYear) {
        return dataService.createTeacher(lastName, firstName, birthYear);
    }

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        return studentGroupService.createStudentGroup(teacher, students);
    }

    public List<User> getStudents() {
        return dataService.getStudents();
    }

    public List<User> getTeachers() {
        return dataService.getTeachers();
    }

    public StudentGroup getStudentGroup() {
        return studentGroupService.getStudentGroup();
    }
}