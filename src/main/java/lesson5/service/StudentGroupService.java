package lesson5.service;

import lesson5.model.Student;
import lesson5.model.StudentGroup;
import lesson5.model.Teacher;

import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        return this.studentGroup = new StudentGroup(teacher, students);
    }

    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public StudentGroup getStudentGroup() {
        return this.studentGroup;
    }
}
