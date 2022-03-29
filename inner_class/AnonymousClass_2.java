interface Test_int {
    void info();// this is method is public here

    static void showDet() {
        System.out.println("showing details through static method");
    }
}

public class AnonymousClass_2 {
    public static void main(String[] args) {
        Test_int ref1 = new Test_int() {
            public void info() {
                System.out.println("showing through Anonymous class");
            }
        };
        ref1.info();
        Test_int.showDet();

        new Test_int() {
            public void info() {
                System.out.println("Showing w/o creating ref var");
            }
        }.info();
    }
}
