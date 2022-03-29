interface Func {
    int sum(int a, int b);
}

interface Func2 {
    int sum(int a);
}

interface Func3 {
    void sum();
}

interface Func4 {
    void sumBlock(int x, int y);
}

public class LambdaEg {
    public static void main(String[] args) {

        Func2 ref = new Func2() {// Using Anonymous class
            public int sum(int a) {
                System.out.println("Anonymous class");
                return a * a;
            }
        };
        ref.sum(10);

        // LAMBDA FUNCs
        // These function are overriding Interface abstract methods
        Func f1 = (int a, int b) -> a + b;// 1st method
        Func f11 = (a, b) -> (a + 1) * (b + 1);
        Func f12 = (a, b) -> {// block level Lambda
            System.out.print("here in block lvl with return type : ");
            return a * b;
        };

        Func2 f2 = (int a) -> a * a;// 2nd method
        Func2 f21 = (a) -> (a + 1) * a;
        Func2 f22 = a -> (a + 1) * (a + 1);

        Func3 f3 = () -> System.out.println("No arg");// 3rd method
        // if here we'll write (2+4) in place of SOP then it will return a val
        // but void func we can't return

        Func4 f4 = (a, b) -> {// block level w/o return type
            System.out.println("here in block level lambda");
        };

        System.out.println(f1.sum(1, 3));
        System.out.println(f11.sum(1, 3));
        System.out.println(f12.sum(1, 3));
        System.out.println(f2.sum(3));
        System.out.println(f21.sum(3));
        System.out.println(f22.sum(3));
        f3.sum();
        f4.sumBlock(2, 3);
    }
}
