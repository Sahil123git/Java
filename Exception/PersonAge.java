import java.util.Scanner;

class NegativeAgeException extends Throwable {
    String msg;

    NegativeAgeException(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return msg + " user defined exception";
    }
}

public class PersonAge {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
        int age = ref.nextInt();
        try {
            if (age < 0) {
                throw new NegativeAgeException("Age can't be negative");

            } else {
                System.out.println("Correct age");
            }
        } catch (NegativeAgeException e) {
            System.out.println(e);
        }
    }
}
