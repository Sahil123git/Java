public class Print_char {

    static void prnt_str(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // char ca1[] = new char[4];//or can use this
        char ca[] = { 'a', 'b', 'c', 'd' };
        String s4 = new String(ca);

        String s1 = "sahil";
        String s2 = "hello";
        String s3 = new String("sahild");
        Print_char.prnt_str(s4);
        // Print_char j = new Print_char(); //for this to run don't make prnt_str method
        // j.prnt_str(s2); //static
        prnt_str(s1);
        prnt_str(s2);
        prnt_str(s3);

        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

    }
}
