public class intro_arr_str {
    static boolean b;
    public static void main(String args[]) {

        int nw_arr[] = new int[4];// arr obj will be in heap rev var nw_arr is pntng to them
        int nw_arr2[] = new int[] { 1, 2, 3, 4 };
        // Stirng nw_arr3[];
        // nw_arr3 = new int[10];
        // --------------------------------------------
        String str[] = { "hello", "how", "are", "you" };// string obj will be in heap ref var str pntng to the string
                                                        // arr
        int num[] = { 1, 2, 3, 4, 5 };
        int[] x, y;// both are of arr type
        int x2[], y3;// only x is of type arr
        // ------------------------------------------
        int x8 = 4_________3__5;// this is also allowed in jave to make number more readable
        System.out.println(x8);
        System.out.println(num[0]);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println(b);//to see default value
    }
}
