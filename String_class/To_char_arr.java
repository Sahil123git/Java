public class To_char_arr {
    public static void main(String args[]) {
        String str = "hello how are you";
        char[] ca = str.toCharArray();

        for (char ch : ca) {
            System.out.print(ch + " ");
        }

        String sub = str.substring(5);
        String sub2 = str.substring(4, 11);

        System.out.println(sub);
        System.out.println(sub2);
    }
}
