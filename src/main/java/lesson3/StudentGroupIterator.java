package lesson3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StudentGroupIterator implements Iterator<Student> {
    private List<Student> studentList;
    private int counter;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.getStudentList();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size() - 1;
    }

    @Override
    public Student next() {
        if (hasNext()) {
            return studentList.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        studentList = new ArrayList<>();
        counter = 0;
    }
}
