package lesson4.hw;

import java.util.Comparator;

public class TeacherComparator <T extends Teacher> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.age, o2.age);
    }
}
