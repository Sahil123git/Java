import java.util.*;

public class Constructor_hashMap {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<String, String>();
        // key value pair
        System.out.println(hm.isEmpty());
        hm.put("India", "Delhi");
        hm.put("Australia", "Canbera");
        hm.put("UK", "London");
        hm.put("Russia", "Moscow");
        hm.put("South Korea", "Seoul");

        Set<Map.Entry<String, String>> mp = hm.entrySet();

        for (Map.Entry<String, String> me : mp) {
            System.out.println(me.getKey() + " " +
                    me.getValue());
        }

        HashMap<String, String> hm1 = new HashMap<String, String>();
        hm1.putAll(hm);
        Set<Map.Entry<String, String>> mp1 = hm1.entrySet();

        for (Map.Entry<String, String> me1 : mp1) {
            System.out.println(me1.getKey() + "->" +
                    me1.getValue());
        }

    }
}