package lesson4.hw;

public class MathTeacher extends Teacher{
    public MathTeacher(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    public String toString() {
        return "MathTeacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
