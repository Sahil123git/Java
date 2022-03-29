class Test extends Throwable {
    String msg;

    Test(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return "my message " + msg;
    }

}

class UserDefExp {

    public static void main(String ar[]) {

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
        } catch (Exception e) {// should be after java defined exception
            System.out.println("Some error occured ");
        } catch (Test t) {
            System.out.println(t);
        } finally {
            System.out.println("finally executed");
        }

        // try catch finally
        // try catch
        // try finally
        // throw keyword

    }

}