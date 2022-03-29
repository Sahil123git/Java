public class NestingException {

    public static void main(String ar[]) {

        try {
            int a = 10;
            int b = 20;
            int c = a * b;

            try {
                int arr[] = { 5, 6, 4, 7 };

                System.out.println(arr[6]);

            } catch (ArithmeticException ae) {
                System.out.println("inner try caught");
            }

        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("outer try caught");
        }

    }

}
