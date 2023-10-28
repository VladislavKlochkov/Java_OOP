package lesson4.hw;

import lesson4.cw.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherGroup<T extends Teacher> implements Iterator<T> {
    private List<T> teacherGroup;
    int counter;

    public TeacherGroup(List<T> teachers) {
        this.teacherGroup = teachers;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < teacherGroup.size() - 1;
    }

    @Override
    public T next() {
        if (hasNext()) {
            return teacherGroup.get(counter++);
        }
        return null;
    }
}
