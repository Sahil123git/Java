import java.util.*;

public class ArrayListEg {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<String>();// now it can have obj of type stirng only
        str.add("hii");
        str.add("hello");
        str.add("world");

        System.out.println(str.get(1));// to get the ele at this index(ind as argument)
        System.out.println(str);

        ListIterator lt = str.listIterator();
        while (lt.hasNext()) {
        System.out.println(lt.next());
        }

        List ad = new ArrayList();
        ad.add("ds");
        ad.add(78);
    }
}
