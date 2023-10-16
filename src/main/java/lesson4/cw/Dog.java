package lesson4.cw;

public class Dog extends User {
    int age;

    public Dog(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }

}
