package lesson3;

import java.util.Comparator;

public class StudentGroupComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.age, student2.age);
    }

//    @Override
//    public int compare(Student student1, Student student2) {
//        return student1.getLastName().length() - student2.getLastName().length();
//    }
}
