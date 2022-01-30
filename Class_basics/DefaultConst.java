class Student {
    int rollno;
    String name;

    Student() {
        rollno = 30;
        name = "rohit";
    }

    void getDetails(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void print() {
        System.out.println(rollno + " " + name);
    }
}

public class DefaultConst {

    public static void main(String a[]) {
        Student s1 = new Student();
        // s1 is reference variable
        s1.print();
        s1.getDetails(55, "Pujara");
        s1.print();

    }
}