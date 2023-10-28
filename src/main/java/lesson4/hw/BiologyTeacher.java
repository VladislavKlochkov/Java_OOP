package lesson4.hw;

public class BiologyTeacher extends Teacher{
    public BiologyTeacher(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    public String toString() {
        return "BiologyTeacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
