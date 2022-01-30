public class pass_val {
    int a, b;

    static void meth(int a, int b) {
        a = a + 5;
        b = b - 5;
        System.out.println(a + " " + b);
    }

    public static void main(String args[]) {
        int a = 30, b = 30;
        pass_val.meth(a, b);

        System.out.println(a + " " + b);
    }
}
