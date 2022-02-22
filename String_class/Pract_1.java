import java.util.Scanner;

public class Pract_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while (str.indexOf('x') >= 0) {
            int ind = str.indexOf('x');
            // if (ind == str.length() - 1) {//w/o this also will work
            // str = str.substring(0, ind);
            // continue;
            // }
            str = str.substring(0, ind) + str.substring(ind + 1);
        }
        String s = sc.nextLine();
        System.out.println(str + s);
    }
}
