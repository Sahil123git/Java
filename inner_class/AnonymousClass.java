
// interfaces or abstract classes
// interfaces or abstract classes

interface TestInt {

    void show();
}

class Derived implements TestInt {
    public void show() {
        System.out.println("shi");
    }
}

class Concrete {
    void show() {
        System.out.println("sahil");
    }
}

public class AnonymousClass {
    public static void main(String args[]) {

        Concrete ref = new Concrete() {// Anonymous class for concrete class
            @Override
            void show() {
                System.out.println("sh");
            }
        };
        ref.show();
        // ref.sh();

        TestInt t = new Derived();
        t.show();

        // TestInt t3=new class Noname implements TestInt{}
        // so we can remove the name as this is without name
        TestInt t3 = new TestInt() {// creating obj Anonymous class
            public void show() {
                System.out.println("version 2 of show");
            }
        };
        t3.show();

        TestInt t4 = new TestInt() {
            public void show() {
                System.out.println("version 3 of show");
            }
        };
        t4.show();

        new TestInt() {
            public void show() {
                System.out.println("version 4 of show");
            }
        }.show();

    }

}