class Test extends Throwable {
    String msg;

    Test(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return "my message " + msg;
    }

}

public class ThrowsExcepCncpt {
    static void meth() throws Test {
        // Throws means it can send error so manage tht

        try {

            int a = 10;
            int b = 20;

            if (a < b) {
                // throw new ArithmeticException("new exception object ");
                throw new Test("test exception generated ");
            } else {
                throw new ArrayIndexOutOfBoundsException("second exception object");
            }

        } catch (ArithmeticException ae) {
            System.out.println(ae);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println(ae);
        }
        // catch(Test t){System.out.println(t);}
        finally {
            System.out.println("finally executed");
        }

    }

    public static void main(String ar[]) throws Test {
        // this throws Test will pass on error to default handler
        try {
            meth();
        } catch (Test t) {
        }
        meth();// this is not handled by user so will get warning
    }

}