// try catch finally
// try catch
// try finally

class Test1 extends ArithmeticException {// unchecked exception which can't be checked by compiler(means the code will
    // get compiled, but can give error if there is any during runtime)
    String desc;

    Test1(String des) {
        desc = des;
    }

    public String toString() {
        return desc + " user defined";
    }
}

class Test extends Throwable {// checked exception these are those which compiler can cheeck
    // if we are not handling they will not get compiled

}

class ChkdUnchkd {

    static void meth() throws Test {// if we are not handeling checked exception compiler will throw an error
        int a = 20;
        int b = 30;

        if (a < b) {
            // throw new Test();
            // throw new Test("user defined exception ");
            throw new Test();
        }

    }

    static void meth1() {// unchecked exception
        int a = 20;
        int b = 30;

        if (a < b) {
            // throw new Test();
            throw new Test1("user defined exception ");
        }

    }

    public static void main(String[] args) {

        try {// in case of checked exception
            meth();
        } catch (Test te) {
            // System.out.println(te);
            System.out.println("found");
        }

        try {// in case of unchecked exception
            meth1();
        } catch (Test1 te) {
            System.out.println(te);
        }

    }

}