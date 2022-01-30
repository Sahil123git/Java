public class merge_2_arr_2 {
    int[] meth(int[] a, int b[]) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = Math.max(a[i], b[i]);
        }
        return c;
    }

    public static void main(String[] args) {
        merge_2_arr_2 v = new merge_2_arr_2();
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 10, 2, 13, 4, 52 };
        int[] c = v.meth(arr1, arr2);

        for (int x : c)
            System.out.print(x + " ");
        System.out.println();
    }
}
