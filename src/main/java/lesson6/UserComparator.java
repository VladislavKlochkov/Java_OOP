package lesson6;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getFirstName().length() - o2.getFirstName().length();
    }

}
