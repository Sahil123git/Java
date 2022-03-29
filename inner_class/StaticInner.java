class A {

    int x = 20;
    private int pr = 30;
    private static int z = 98;
    static int y = 30;

    void display_() {
        System.out.println("s");
    }

    static class B {
        // it can access only static var
        void display() {
            // System.out.println(x);
            System.out.println(y + " " + z);
            A ref = new A();
            System.out.println("non static memb " + ref.x + " " + ref.pr);
            // display_();
            // non static members can be accessed with object reference
        }
    }

}

class C extends A {// it can only override A methods
    void display() {// this is should present in A (B mthds doesnt matter to this)
        System.out.println("hello");
    }
}

class StaticInner {

    public static void main(String args[]) {
        A a = new A();

        A.B b = new A.B();
        b.display();

        A c = new C();
        // c.display();
    }

}