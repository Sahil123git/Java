public class Static_var {
    String name;
    int empid;

    void printEmployeeDetails() {
        System.out.println(name + " " + empid);
    }

    public static void main(String[] args) {
        Static_var sd = new Static_var();// can create obj usng this mthd only
        System.out.println(sd.name);
    }
}
