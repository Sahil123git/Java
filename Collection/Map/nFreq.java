import java.util.*;

public class nFreq {
    public static void main(String[] args) {

        Scanner m = new Scanner(System.in);
        int key = m.nextInt();
        int n = m.nextInt();
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            int ele = m.nextInt();
            int fill = 0;// 1st time then freq of ele will be 0
            if (freq.get(ele) != null) {
                fill = freq.get(ele);
            }
            freq.put(ele, fill + 1);
        }

        for (Integer s : freq.keySet()) {
            if (freq.get(s) == key) {
                System.out.print(s + " ");
            }
        }
        // System.out.println(freq);

    }
}