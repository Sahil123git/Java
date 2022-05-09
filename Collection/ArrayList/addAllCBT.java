import java.util.*;

public class addAllCBT {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.add(3);
        ar.add(4);
        ar.add(4);
        ar.add(40);
        System.out.println(ar.remove(0));// this can give error of IndexOutOfBound
        System.out.println(ar.lastIndexOf(4));
        System.out.println(ar.set(2, 78) + " ele");// returns prev allocated ele

        Set<Integer> set = new TreeSet<>((a, b) -> a > b ? 1 : -1);
        // here we using user defind code for how to store ele, but here we are not
        // handling duplicate ele case so it can have duplicate ele
        set.add(5);
        set.add(4);
        set.add(3);
        set.add(3);
        set.remove(5);// this removes ele and don't use index

        // set.addAll(ar);// append other collection's all ele but acc to TreeSet
        // // formula
        // ar.addAll(set);
        ar.removeAll(set);
        System.out.println(set);
        System.out.println(ar);

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
