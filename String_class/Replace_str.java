public class Replace_str {
    public static void main(String args[]) {
        String str = "   what is your name    ";
        String t = str.replace('a', 'g');
        System.out.println(t);

        String rep = str.replace("what is your", "no");
        System.out.println(rep);

        String tr = str.trim();// to trim leading or trailing spaces
        System.out.println(tr);

        String st[] = tr.split(" ");// split str in str arr when see " "(space)
        for (String s : st) {
            System.out.println(s);
        }
    }
}
