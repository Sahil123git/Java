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

class GenericClass<T> {// Generic can't work Primitive int only with wrapper class
    T obj;

    GenericClass(T o) {
        obj = o;
    }

    T getObj() {
        return obj;
    }

    void showType() {
        System.out.println("Type of T is " + obj.getClass().getName());
    }
}

class ArrayList_Generic {
    public static void main(String[] args) {
        GenericClass<Integer> obj;
        obj = new GenericClass<>(12);
        // obj = new GenericClass<Integer>(12); this can also be used in place of above
        // statemetn
        obj.showType();
        int v = obj.getObj();
        System.out.println(v);

        // -With String
        GenericClass<String> str = new GenericClass<String>("Sahil");
        str.showType();
        String st = str.getObj();
        System.out.println(st);

        // -With Class
        GenericClass<Student> obj3 = new GenericClass<Student>(new Student("Raj", 121));
        obj3.showType();
        Student s1 = obj3.getObj();
        System.out.println(s1);
    }
}
