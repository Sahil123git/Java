interface One {

    int sum(int a, int b); // public

    double PI = 3.14;// public static final

    default int subtract(int a, int b) {
        System.out.println("default implementation");
        return 0;
    }

    static void meth1() {
        System.out.println("static method in interface");
    }

}

interface Two {
    void show2();

    int sum(int a, int b);
}

interface Three extends One, Two {

    int multiply(int a, int b);
}

public class Intro2 implements Three, One, Two {

    void show1() {
        System.out.println("this is non interface method");
    }

    public int sum(int a, int b) {
        System.out.println(PI);
        return a + b;

    }

    public int multiply(int a, int b) {
        int c = a * b;
        return c;
    }

    public int subtract(int a, int b) {

        return a - b;

    }

    public void show2() {
        System.out.println("show");
    }

    public static void main(String args[]) {
        Intro2 ti = new Intro2();
        System.out.println(ti.sum(23, 14));
        int res = ti.sum(12, 15);
        System.out.println(res);
        ti.show1();
        res = ti.subtract(12, 5);
        System.out.println(res);
        One.meth1();
    }
}