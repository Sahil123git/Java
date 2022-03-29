interface One {

    int sum(int a, int b); // public here we are declaring this method

    double PI = 3.14;// public static final

    default int subtract(int a, int b) {
        System.out.println("default implementation");
        return 0;
    }

    static void meth1() {
        System.out.println("static method in interface");
    }

}

interface two extends One {

}

public class Intro implements One {

    void show() {
        System.out.println("this is non interface method");
    }

    public int sum(int a, int b) {// here we are defining
        System.out.println(PI);
        return a + b;

    }

    public int subtract(int a, int b) {

        return a - b;

    }

    public static void main(String args[]) {
        Intro ti = new Intro();
        System.out.println(ti.sum(23, 14));
        int res = ti.sum(12, 15);
        System.out.println(res);
        ti.show();
        res = ti.subtract(12, 5);
        System.out.println(res);
        One.meth1();
    }
}
