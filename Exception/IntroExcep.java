public class IntroExcep {
    public static void main(String ar[]) {

        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("array index not present");
        } catch (ArithmeticException ae) {
            System.out.println("divide by zero occured");
        }

        try {
            int arr[] = { 2, 4, 5, 6 };

            System.out.println(arr[6]);
        } catch (ArithmeticException ae) {
            System.out.println("divide by zero occured");
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("array index not present");
        }
        // try, catch, finally

    }

}