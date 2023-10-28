package lesson5.service;

import lesson5.model.Student;
import lesson5.model.Teacher;
import lesson5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private final List<User> students;
    private final List<User> teachers;


    public DataService() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public List<User> createStudent(String lastName, String firstName, String birthYear) {
        Long maxIdStudent = 0L;
        for (User user : students) {
            if (user instanceof Student) {
                if (((Student) user).getStudentId() > maxIdStudent) {
                    maxIdStudent = ((Student) user).getStudentId();
                    Student student = new Student(lastName, firstName, birthYear, maxIdStudent);
                    this.students.add(student);
                    maxIdStudent++;
                }
            }
        }
        return this.students;
    }

    public List<User> createTeacher(String lastName, String firstName, String birthYear) {
        Long maxIdTeacher = 0L;
        for (User user : teachers) {
            if (user instanceof Teacher) {
                if (((Teacher) user).getTeacherId() > maxIdTeacher) {
                    maxIdTeacher = (((Teacher) user)).getTeacherId();
                    Teacher teacher = new Teacher(lastName, firstName, birthYear, maxIdTeacher);
                    this.teachers.add(teacher);
                    maxIdTeacher++;
                }
            }
        }
        return this.teachers;
    }

    public List<User> getStudents() {
        return this.students;
    }
    public List<User> getTeachers() {
        return this.teachers;
    }
}
