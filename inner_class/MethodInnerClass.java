class A {
    int x = 10;

    void compute() {
        for (int i = 0; i < 10; i++) {// creating 1 class instead more
            class B {
                int incByTen(int i) {
                    return i + 10;
                }

                int decByTen(int i) {
                    return i - 10;
                }
            }

            B b1 = new B();// can't create ref in main

            System.out.println(b1.incByTen(i));
            System.out.println(b1.decByTen(i));
        }
    }

}

class MethodInnerClass {

    public static void main(String args[]) {

        A a1 = new A();

        a1.compute();

    }

}