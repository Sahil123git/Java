import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int rollno;
    double cgpa;

    Student() {
    }

    Student(String n, int roll, double cg) {
        name = n;
        rollno = roll;
        cgpa = cg;
    }

    public String toString() {
        return "name is : " + name + "rollno is : " + rollno + "cgpa is : " + cgpa;
    }

    public int compareTo(Student st) {
        return (this.rollno > st.rollno ? 5 : -5);
    }
}

public class ComparableStu {
    public static void main(String args[]) {
        ArrayList<Student> l = new ArrayList<Student>();
        l.add(new Student("Ritesh Jaiswal", 12012297, 9.52));
        l.add(new Student("Rahul Gupta", 12012298, 9.53));
        l.add(new Student("Abhimanyu Patel", 12012299, 9.54));
        Collections.sort(l);
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}