package lesson4.cw;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> students = new ArrayList<>();
        User student1 = new User("Ivan", "Ivanov");
        User student2 = new User("Vladimir", "Petrov");
        User student3 = new User("Kitty", "Monson");

        students.add(student1);
        students.add(student2);
        students.add(student3);


        students.sort(new UserComparator<>());
        System.out.println(students);

        for (User user : students) {
            System.out.println(user.getLastName());
        }

        Dog dog1 = new Dog("Sharik", 5);
        Dog dog2 = new Dog("Bobik", 3);
        Dog dog3 = new Dog("Jassy", 4);

        List<Dog> dogs = new ArrayList<>(List.of(dog1, dog2, dog3));

        dogs.sort(new UserComparator<Dog>());
        System.out.println(dogs);


    }
}
