package DSABackup.customSorting;

public class Student implements Comparable<Student> {
    private int id;
    private int marks;

    public Student(int id, int marks) {
        this.id = id;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student that) {
        if(this.marks == that.marks) {
            if(this.id > that.id) {
                return 1;
            }
        }
        if(this.marks > that.marks) {
            return 1; // 1 if there is a need to swap
        }
        return -1; // -1 if there is no need to swap
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", marks=" + marks +
                '}';
    }
}
