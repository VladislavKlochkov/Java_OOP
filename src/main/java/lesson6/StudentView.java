package lesson6;

import java.util.List;

public class StudentView implements UserView<Student> {
    @Override
    public void print(List<Student> listT) {
        System.out.println("Список студентов: ");
        for (Student student : listT) {
            System.out.println(student.getLastName());
        }
    }
}
