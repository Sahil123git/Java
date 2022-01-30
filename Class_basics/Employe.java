public class Employe {
    static int ele = 12;
    String name;
    int empid;

    Employe() {
        name = "Jack";
        empid = 1213;
    }

    Employe(int i, String n) {
        name = n;
        empid = i;
    }

    void printEmployeeDetails() {
        System.out.println(name + " " + empid);
    }

    public static void main(String[] args) {
        Employe obj1 = new Employe();
        Employe obj2 = new Employe(1232, "John");
        System.out.println(Employe.ele);// accessing static variable
        obj2.printEmployeeDetails();
    }
}
