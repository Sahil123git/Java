import java.util.Scanner;

public class pass_by_ref {
    int a, b;

    static void meth(pass_by_ref ta) {
        ta.a = ta.a + 5;
        ta.b = ta.b - 5;
        System.out.println(ta.a + " " + ta.b);
    }

    public static void main(String args[]) {
        pass_by_ref ta1 = new pass_by_ref();// ta1 is ref variable
        ta1.a = 45;
        ta1.b = 60;

        pass_by_ref.meth(ta1);// should be call using class (like static var) or meth is in the same class can
                              // be called w/o ref
                              // var also
        // meth(ta1);// like this w/o class

        System.out.println(ta1.a + " " + ta1.b);
    }
}