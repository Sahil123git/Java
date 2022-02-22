class String_func {

    static void printString(String s) {
        for (int i = 0; i < s.length(); i++)
            System.out.print(s.charAt(i));
        System.out.println();
    }

    public static void main(String[] args) {

        char ca[] = { 'a', 'b', 'c', 'd', 'e' };
        String s4 = new String(ca);
        String s1 = "hello";
        String s3 = "HELLO";
        String s2 = new String("hello");
        // length()
        System.out.println(s2.length());
        System.out.println(args.length);
        printString(s4);
        printString(s2);
        System.out.println(s4.toUpperCase());
        System.out.println(s3.toLowerCase());
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1 == s2);
        String s5 = "hello how are you";
        System.out.println("starts with hello " + s5.startsWith("hello"));
        System.out.println("starts with how " + s5.startsWith("how"));
        System.out.println("starts with how " + s5.startsWith("how", 6));
        System.out.println("Ends with you " + s5.endsWith("you"));

    }
}