public class StringBuilderIntro {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(12300);

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb = new StringBuilder("sahil");
        System.out.println(sb.capacity());
        sb.append(" Dussa");
        System.out.println(sb);

        sb.insert(2, "raj");
        System.out.println(sb);
        sb.delete(2, 5);// will delete from start ind to end-1
        System.out.println(sb);

        sb.replace(1, 2, "rocky");// replace st ind but till end-1
        System.out.println(sb);
    }
}
