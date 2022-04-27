class Student {

    String name;
    int rollno;

    Student(String n, int r) {
        name = n;
        rollno = r;
    }

    public String toString() {
        return "Student name:" + name + " Roll no :" + rollno;
    }
}

class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    void showTypes() {
        System.out.println("Type of T is " + ob1.getClass());
        System.out.println("Type of V is " +
                ob2.getClass());
    }

    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }
}

class TwoParamGen {
    public static void main(String args[]) {

        TwoGen<Integer, String> t = new TwoGen<Integer, String>(123, "Testing Two Parameter");
        t.showTypes();
        int v = t.getob1();
        System.out.println("value: " + v);
        String str = t.getob2();
        System.out.println("value: " + str);

        TwoGen<String, Student> obj = new TwoGen<String, Student>("Sahil", new Student("Raj", 121));
        obj.showTypes();
        str = obj.getob1();
        System.out.println(str);
        Student s1 = obj.getob2();
        System.out.println(s1);
    }
}
