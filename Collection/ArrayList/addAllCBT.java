import java.util.*;

public class addAllCBT {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(3);
        ar.add(4);
        ar.add(4);
        ar.add(4);

        Set<Integer> set = new TreeSet<>((a, b) -> a > b ? 1 : -1);
        set.add(5);
        set.add(4);
        set.add(3);
        
        set.addAll(ar);// append other collection's all ele but acc to TreeSet formula
        ar.addAll(set);

        System.out.println(set);
        System.out.println(ar);
    }
}