package lesson5.model;

public class Teacher extends User {
    private Long teacherId;

    public Teacher(String lastName, String firstName, String birthYear, Long teacherId) {
        super(lastName, firstName, birthYear);
        this.teacherId = teacherId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birthYear='" + birthYear + '\'' +
                '}';
    }
}
