abstract class TestAbstract {
    abstract void meth();
}

public class Anonymous_class2 {
    public static void main(String[] args) {
        TestAbstract ta = new TestAbstract() {
            public void meth() {
                System.out.println("hello meth 1 of abs");
            }

            void ownMeth() {// can't call this method
                System.out.println("hello");
            }
        };
        ta.meth();

        new TestAbstract() {
            public void meth() {
                System.out.println("hello usng 2nd method");
            }

        }.meth();
    }
}
