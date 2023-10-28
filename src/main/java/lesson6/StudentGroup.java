package lesson6;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private String groupName;
    private List<Student> studentList;

    public StudentGroup(String groupName, List<Student> studentList) {
        this.groupName = groupName;
        this.studentList = new ArrayList<>();
    }

    public int getSize() {
        return studentList.size();
    }

    public Student getIndex(int index) {
        return studentList.get(index);
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "groupName= '" + groupName + '\'' +
                ", studentList= " + studentList +
                '}';
    }

    @Override
    public UserIterator iterator() {
        return new UserIterator(studentList);
    }

}
