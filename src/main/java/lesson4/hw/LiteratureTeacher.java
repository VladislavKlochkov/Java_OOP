package lesson4.hw;

public class LiteratureTeacher extends Teacher {
        public LiteratureTeacher(String name, int age, String sex) {
                super(name, age, sex);
        }

        @Override
        public String toString() {
                return "LiteratureTeacher{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", sex='" + sex + '\'' +
                        '}';
        }
}
