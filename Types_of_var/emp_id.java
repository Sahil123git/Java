public class emp_id {
    static int inc = 1;// this inc is having 1 copy per class so we can use to incemnt id
    int id;
    String name;
    int roll;

    emp_id() {
        id = inc++;
    }

    emp_id(int roll, String name) {
        id = inc++;
        this.roll = roll;
        this.name = name;
    }

    void show_det() {
        System.out.println(id + " " + roll + " " + name);
    }

    public static void main(String args[]) {
        emp_id e1 = new emp_id();
        emp_id e2 = new emp_id(19, "sahil");
        emp_id e3 = new emp_id();
        emp_id e4 = new emp_id(20, "raj");

        e1.show_det();
        e2.show_det();
        e3.show_det();
        e4.show_det();
    }
}
