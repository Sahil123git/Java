import java.util.*;

public class ArrayListMeth {
    public static void main(String[] args) {
        ArrayList<Integer> str = new ArrayList<>();// now it can have obj of type stirng only
        str.add(1);
        str.add(2);
        str.add(4);
        str.add(4);
        str.add(4);
        str.add(2, 5);// add ele at this index and if there is already a ele that will be shifted by 1
                      // to right side
        // str.set(10, 5);// this replaces the old ele with this ele
        str.remove(5);// remove the ele with this indexs

        System.out.println(str);

        ListIterator lt = str.listIterator();
        while (lt.hasNext()) {
        System.out.println(lt.next());
        }
    }
}
