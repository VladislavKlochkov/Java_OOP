package lesson4.hw;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();
        BiologyTeacher teacher1 = new BiologyTeacher("Viktoria", 35, "female");
        MathTeacher teacher2 = new MathTeacher("Oleg", 45, "male");
        LiteratureTeacher teacher3 = new LiteratureTeacher("Elena", 40, "female");

        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);

        for (Teacher teacher : teachers) {
            System.out.println(teacher.getName());
        }

        teachers.sort(new TeacherComparator<Teacher>());
        System.out.println(teachers);
    }
}
