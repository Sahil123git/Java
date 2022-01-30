
// Your First Program
import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        byte age = 30;
        String name = "sahil";
        System.out.println(name);
        System.out.println("Hello, World!");
        Scanner input = new Scanner(System.in);
        System.out.println("input ur age");
        int number = input.nextInt();
        String nmber = input.nextLine();
        System.out.println(number + " " + nmber);
        // string sahil = "sahil";
    }
}