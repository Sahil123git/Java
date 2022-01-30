public class chkr_j {
    public static void main(String[] args) {
        String n1 = "Ganga", n2 = "Amazon";
        boolean s1 = n1 instanceof String;
        boolean s2 = args instanceof String[];
        boolean s3 = args instanceof Object;
        boolean s4 = n1 instanceof Object;
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

        String t = n2 + (n1 + (1 + 2)+'k');
        System.out.println(t);

    }
}