class A {
    void hello() {
        System.out.println("hello");
    }

}

public class BA extends A {

    void hello() {
        System.out.println("hello from B");
    }

    public static void main(String[] args) {
        A pt = new BA();
        pt.hello();
    }
}
