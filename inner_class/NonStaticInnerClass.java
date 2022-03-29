class A {
    int a;
    static int b = 12;
    private static int c = 14;

    void show() {
        B ref = new B();
        ref.show();// will call show of B class
    }

    class B {// non static inner class
        public void show() {
            System.out.println("Values are :" + a + " " + b + " " + c);
        }
    }
}

public class NonStaticInnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();// will call show of A class

        A.B in_obj = obj.new B();// using ref var of A class
        in_obj.show();

        A.B in_obj1 = new A().new B();// w/o ref of A
        in_obj1.show();
        // int c = in_obj.a; can't do this
    }

}
