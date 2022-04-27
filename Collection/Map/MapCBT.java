import java.util.*;

public class MapCBT {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(5, "Sahil");
        map.put(-2, "Raj");
        map.put(null,"Sanchit");

        System.out.println(map.get(1)+"  "+map.get(null));
    }
}
