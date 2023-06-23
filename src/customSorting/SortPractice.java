package customSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortPractice {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, 90));
        studentList.add(new Student(2, 89));
        studentList.add(new Student(3, 89));
        studentList.add(new Student(4, 90));
        studentList.add(new Student(5, 89));
        Collections.sort(studentList);
        System.out.println(studentList);
    }
}
