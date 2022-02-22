import java.util.Scanner;

public class Pract_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 3; i >= 1; i--) {
            if (str.substring(0, i).equals(str.substring(str.length() - i))) {
                str = str.substring(0, str.length()-i);
                break;
            }
        }
        System.out.println(str);
    }
}
