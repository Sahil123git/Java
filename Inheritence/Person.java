public class Person {

    double height;
    double weight;
    double bmi;
    String name;
    int age;

    Person() {
        height = -1;
        weight = -1;
    }

    Person(double height, double weight) {
        this.height = height;
        this.weight = weight;
        bmi = weight / (height * height);
    }

    Person(Person p) {
        this(p.height, p.weight);
    }

    void show() {
        System.out.println("height = " + height + " weight = " + weight);
        System.out.println("BMI =" + bmi);
    }

    String getName() {// get method
        return name;
    }

    void setName(String name) {// set method
        this.name = name;
    }

    public String toString() {// we can use this to print ref obj
        return "The values are " + name + " " + height + " " + weight + " " + bmi;
    }

    public static void main(String ar[]) {
        Person p1 = new Person(5, 60);
        Person p2 = new Person(3, 50);
        Person p3 = new Person(p2);
        // p1.show();p2.show();p3.show();
        p2.setName("Raj");
        System.out.println(p2);
        Student s1 = new Student("virat", 5, 60);
        s1.setName("Ajay");
        // s1.showDetails();
        // s1.show();
        s1.setBranch("CSE");
        System.out.println(s1);

        AndroidStudent as1 = new AndroidStudent();
        as1.setSpecialization("Web dev");// this will chng spec to webdev
        as1.setBranch("IT");
        System.out.println(as1);

    }
}

class Student extends Person {

    String branchName;

    Student() {

    }

    Student(int w, int h) {
        System.out.println("hi");
    }

    Student(String name, double height, double weight) {
        super(height, weight);
        setName(name);
    }

    public String toString() {// this is overriding
        return "The values are " + name + " " + height + " " + weight + " " + bmi + " " + branchName;
    }

    void showDetails() {
        System.out.println("Name is " + name + " Branch name is " + branchName);

    }

    String getBranch() {
        return branchName;
    }

    void setBranch(String Branch) {
        this.branchName = Branch;
    }
}

class AndroidStudent extends Student {
    String specialization;

    public String toString() {// this is overriding
        return "The values are " + name + " " + height + " " + weight + " " + bmi + " " + branchName + " "
                + specialization;
    }

    AndroidStudent() {
        super("sahil", 10, 50);// will call parent class parametrized const having 3 args
        specialization = "andoid";
    }

    String getSpecialization() {
        return specialization;
    }

    void setSpecialization(String spec) {
        this.specialization = spec;
    }
}