public class merge_2_arr {
    int[] meth(int[] a, int b[]) {
        int[] c = new int[a.length + b.length];
        int k = 0;
        for (int i = 0; i < a.length; i++)
            c[k++] = a[i];
        for (int i = 0; i < b.length; i++)
            c[k++] = b[i];
        for (int x : a)
            System.out.print(x + " ");
        System.out.println();
        for (int x : b)
            System.out.print(x + " ");
        System.out.println();
        for (int x : c)
            System.out.print(x + " ");
        System.out.println();
        return c;
    }

    public static void main(String[] args) {
        merge_2_arr t1 = new merge_2_arr();
        int arr[] = { 1, 2, 3, 4, 5 };
        int[] c = t1.meth(arr, new int[] { 6, 7, 8, 9, 10, 11 });

        for (int x : c)
            System.out.print(x + " ");
        System.out.println();
    }
}
