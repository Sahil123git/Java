import java.util.*;

public class mapIntro {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<String, String>();
        // key value pair
        System.out.println(hm.isEmpty());
        hm.put("India", "Delhi");
        hm.put("Australia", "Canbera");
        hm.put("UK", "London");
        hm.put("Russia", "Moscow");
        hm.put("South Korea", "Seoul");
        System.out.println(hm);// will print all key-value pair for this hm
        System.out.println(hm.isEmpty());
        // hm.clear();
        // System.out.println(hm.isEmpty());

        System.out.println(hm.containsKey("UK"));// having this key
        System.out.println(hm.containsKey("Austria"));
        System.out.println(hm.containsValue("London"));
        System.out.println(hm.get("India"));// print value of this key

        hm.remove("Russia");// remove key with its value
        // and need key as arg not val
        for (String s : hm.keySet()) {
            System.out.println(hm.get(s) + " " + s);
        }

        // hm.clear();// to clear hashMap
        System.out.println(hm.values());// print contained values in hm
        System.out.println(hm.isEmpty());

        Set<Map.Entry<String, String>> mp = hm.entrySet();

        for (Map.Entry<String, String> me : mp) {
            System.out.println(me.getKey() + "->" +
                    me.getValue());
        }
    }
}