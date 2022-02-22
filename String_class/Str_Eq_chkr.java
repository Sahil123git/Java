import java.util.Scanner;

public class Str_Eq_chkr {
    void my_Fun(String s1, String s2) {
        if (s1.equals(s2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println("Starts with " + s1.startsWith("hello"));
        System.out.println("Start with " + s2.startsWith("how", 2));// will find gvn string from 2 index
        System.out.println("Starts with " + s2.endsWith("il"));
    }

    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        String s1 = ob.nextLine();
        String s2 = ob.nextLine();

        Str_Eq_chkr obj = new Str_Eq_chkr();
        obj.my_Fun(s1, s2);
    }
}
