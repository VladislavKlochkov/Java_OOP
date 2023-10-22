package lesson5.model;

public class Student extends User{
    private Long studentId;

    public Student(String lastName, String firstName, String birthYear, Long studentId) {
        super(lastName, firstName, birthYear);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birthYear='" + birthYear + '\'' +
                '}';
    }
}
