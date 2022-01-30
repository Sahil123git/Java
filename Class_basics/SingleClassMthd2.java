public class SingleClassMthd2 {
    int roll;
    String name;

    SingleClassMthd2(int r, String n) {
        roll = r;
        name = n;
    }

    int get_roll() {
        return roll;
    }

    void print_val() {
        System.out.println(roll + " " + name);
    }

    public static void main(String[] args) {
        SingleClassMthd2 obj = new SingleClassMthd2(12, "sahil");
        System.out.println(obj.get_roll());
        obj.print_val();
    }
}
