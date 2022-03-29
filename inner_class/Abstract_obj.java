abstract class TestAbstract {

    abstract void meth1();
}

class Another {
    void meth(TestAbstract ta) {/*
                                 * here this method want obj of TestAbstract but this is abstract class whose
                                 * obj can't be created so use Anonymous class cncpt
                                 */
        System.out.println("meth");

    }
}

public class Abstract_obj {
    public static void main(String args[]) {
        Another at = new Another();
        at.meth(new TestAbstract() {

            public void meth1() {
                System.out.println("version 5");
            }
        });

    }

}