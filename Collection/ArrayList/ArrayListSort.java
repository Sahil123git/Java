import java.util.*;

class Student {
    int rolln;
    String name;

    Student(int roll, String name) {
        rolln = roll;
        this.name = name;
    }

    public String toString() {
        return "Name " + name + " rollno " + rolln;
    }
}

class CgpaSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return (s1.rolln > s2.rolln) ? 1 : -1;
    }
}

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Student> st = new ArrayList<Student>();
        st.add(new Student(12, "virat"));
        st.add(new Student(1, "sahil"));
        st.add(new Student(5, "Rohit"));
        st.add(new Student(3, "Abdul"));
        st.add(new Student(2, "raj"));

        Collections.sort(st, new CgpaSort());

        Iterator itr = st.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
