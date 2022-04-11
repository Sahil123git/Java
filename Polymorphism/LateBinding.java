class A {
    int val;

    A() {
        System.out.println("Default const of class A");
    }

    A(int value) {
        val = value;
    }

    void method_1() {
        System.out.println("method of class A");
    }

    static void staticMethod() {
        System.out.println("Static method of class A");
    }
}

class B extends A {

    B() {
        System.out.println("Default const of class B");
    }

    B(int value) {
        System.out.println("Param const of class B");
    }

    void method_1() {
        System.out.println("method of class B");
    }

    static void staticMethod() {
        System.out.println("Static method of class B");
    }
}

class C extends B {

    C() {
        System.out.println("Default const of class C");
    }

    C(int value) {
        System.out.println("Param const of class C");
    }

    void method_1() {
        System.out.println("method of class C");
    }

    void new_mth() {
        System.out.println("I am new method of this C class");
    }

    static void staticMethod() {
        System.out.println("Static method of class C");
    }
}

public class LateBinding {
    public static void main(String[] args) {
        A l1;
        l1 = new C();// left side should be parent class and right should any child class

        l1.method_1();// will call derived class method
        // l1.new_mth(); error becoz not defined in class A
        l1.staticMethod();// static method will be called of Ref variable type
    }
}
