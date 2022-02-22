class String_initialization {

    public static void main(String[] args) {

        String s1 = "hello";
        String s3 = "hello";
        String s2 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s2);
    }
}
