class Student {
    String name;// Instance var
    int roll;// it is having default value also
    static int cls_var1;// Class var or static var also having default values
    static String cls_var2;// 1 copy per class

    Student(String name) {
        int val1 = 0;// local var and no default val
        this.name = name;
        System.out.println(roll + " " + name + " " + val1 + " " + cls_var2 + " " + this.cls_var1);
    }// this.cls_var1 to call class variable
}

public class var_types {
    public static void main(String[] args) {
        Student s1 = new Student("sahil");
        Student s2 = new Student("rock");
        System.out.println(Student.cls_var1 + " " + s1.cls_var2);
    }
}
