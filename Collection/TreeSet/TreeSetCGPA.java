import java.util.*;

class Student implements Comparable<Student> {
    String name;
    double cgpa;

    Student(String name, double cgpa) {

        this.name = name;
        this.cgpa = cgpa;
    }

    public String toString() {
        return name + " " + cgpa;
    }

    // public int compareTo(Student s){ return (this.cgpa<s.cgpa ? 1:-1);}//
    // descending order
    public int compareTo(Student s) {
        if (this.cgpa == s.cgpa) {
            return 0;
        } else
            return (this.cgpa < s.cgpa ? -1 : 1);
    } // ascending order
}

public class TreeSetCGPA {

    public static void main(String args[]) {

        TreeSet<Student> tree = new TreeSet<Student>();

        tree.add(new Student("a", 6.5));
        tree.add(new Student("b", 7.5));
        tree.add(new Student("c", 8.5));
        tree.add(new Student("a", 6.5));

        System.out.println(tree);
        // javap java.lang.Integer

    }

}