public class ExceptionFinaly {
    public static void main(String ar[]) {

        try {
            int a = 10;
            int b = 20;
            int c = a * b;
            System.out.println(6 + 2);

            try {
                int arr[] = { 5, 6, 4, 7 };

                System.out.println(arr[1]);

            } catch (ArithmeticException ae) {
                System.out.println("inner try caught");
            } finally {
                System.out.println("Using Finally for printing");
            }

        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("outer try caught");
        } finally {
            System.out.println("Using finally of out try");
        }
        /*
         * Types :
         * try catch
         * try catch finally
         * try finally
         */
        // Finally block will alwasy execute

    }

}
