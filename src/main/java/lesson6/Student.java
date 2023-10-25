package lesson6;

public class Student extends User {
    /**
     * 3. Liskov Substitution Principle:
     * Дочерний класс Student следует принципам родительского класса User и не изменяет их.
     */

    private Integer age;

    public Student(String firstName, String lastName, Integer age) {
        super(firstName, lastName);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student: {" +
                "firstName= '" + getFirstName() + '\'' +
                ", lastName= '" + getLastName() + '\'' +
                ", age= " + age +
                '}' + "\n";
    }
}
