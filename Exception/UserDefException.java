class Expt extends Throwable {

}

public class UserDefException {
    public static void main(String[] args) {
        int a = 12, b = 14;
        try {
            if (a < b) {
                throw new ArithmeticException("exception of less");// will get concatenated with Exception type
            } else if (a == b) {
                throw new Expt();
            } else {
                throw new ArrayIndexOutOfBoundsException("Arr out of bound exep");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        } catch (Expt ex) {
            System.out.println("User def exception");
        } catch (Exception e) {
            System.out.println("Some error occured ");
        } finally {
            System.out.println("Printed at the end");
        }

    }
}