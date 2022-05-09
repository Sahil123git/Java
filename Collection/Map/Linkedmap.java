import java.util.*;

public class Linkedmap {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        System.out.println(map.put(4, "bas") + " put");
        map.put(5, "as");
        map.put(5, "cas");
        map.put(7, "sah");
        map.put(3, "das");
        System.out.println(map.remove(5) + " remove");
        System.out.println(map.put(4, "eas"));
        // this insertion of ele in the LinkedHasMap will be acc to their first time
        // insertion
        // map.get(45);
        Set<Integer> key = map.keySet();
        System.out.println(key);// to print set of keys
        for (Integer k : key) {
            System.out.println(map.get(k));
        }
    }
}
