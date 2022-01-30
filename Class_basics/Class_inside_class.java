public class Class_inside_class {
    public static void main(String a[]) {
        Student s1 = new Student();
        // creating obj in heap s1 is reference variable
        s1.print();
        System.out.println(s1.roll);// calling directly from obj
    }// run on CMD to see output
}

class Student {// this is class is not private so visibe to Class_inside_class
    int roll = 10;
    String name = "virat";

    void print() {// this print is method
        System.out.println(roll + " " + name);
    }
}