// Java program to illustrate Constructor Chaining
// within same class Using this() keyword
public class Const_chaining {
    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
    Const_chaining() {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }

    // parameterized constructor 2
    Const_chaining(int x) {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }

    // parameterized constructor 3
    Const_chaining(int x, int y) {
        System.out.println(x * y);
    }

    // void metho()//we can't do const chaining using method
    // { //it must be from constructor
    // this(1,2);
    // System.out.println("he";)
    // }

    public static void main(String args[]) {
        // invokes default constructor first
        new Const_chaining();

    }
}
