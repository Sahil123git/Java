
import java.util.*;

public class LinkedLst_Dequeu {

    public static void main(String args[]) {
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();

        ad.add(12);
        ad.addFirst(15);
        ad.addLast(20);
        ad.push(25);
        System.out.println(ad);

        LinkedList<String> ll = new LinkedList<String>();

        ll.addFirst("ajay");
        ll.addFirst("vijay");
        ll.addFirst("jay");
        ll.push("jy");
        System.out.println(ll);

    }
}