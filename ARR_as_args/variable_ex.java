class variable_ex {
    void meth(int[]... a) {
        int[][] arr_2d = new int[a.length][];

        for (int i = 0; i < a.length; i++) {
            arr_2d[i] = a[i];

        }
        for (int x[] : a) {
            for (int xi : x) {
                System.out.print(xi + " ");
            }
            System.out.println();
        }
    }

    public static void main(String... args) {
        variable_ex t1 = new variable_ex();

        int[] st = new int[] { 1, 23, 4 }, st1 = new int[] { 3, 4, 56 }, st3 = new int[] { 6, 3, 8 };

        t1.meth(st, st1, st3);// actual parameters

    }
}
