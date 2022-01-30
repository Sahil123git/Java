import java.util.Scanner;

public class split_fun {
    public static void main(String args[]) {

        Scanner st = new Scanner(System.in);
        String t = st.nextLine();
        String[] spl = t.split("ds");
        for (String x : spl) {
            System.out.println(x);
        }
        // ------------------------------------------------

        String sr = st.nextLine();
        String[] sp = sr.split("[ -]+");// either " "or hypen
        for (String x : sp) {
            System.out.println(x);
        }
        // ------------------------------------------------

        int s1 = st.nextInt();
        System.out.println(s1);

    }
}
