import java.util.Scanner;

class pass_by_ref_2 {
    int a, b;

    static pass_by_ref_2 meth(pass_by_ref_2 ta) {
        pass_by_ref_2 tn = new pass_by_ref_2();
        tn.a = ta.a + 5;//here we are chngng values of tn not ta
        tn.b = ta.b - 5;

        return tn;
    }

    public static void main(String args[]) {
        pass_by_ref_2 ta1 = new pass_by_ref_2();
        ta1.a = 45;
        ta1.b = 60;
        System.out.println(ta1.a + " " + ta1.b);
        pass_by_ref_2 tc = pass_by_ref_2.meth(ta1);

        System.out.println(tc.a + " " + tc.b);
    }
}