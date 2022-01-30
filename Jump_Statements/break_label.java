public class break_label {
    public static void main(String[] args) {
        int arr[][] = new int[][] { { 1, 3 }, { 4, 5 } };

        outer: for (int i[] : arr) {
            for (int j : i) {
                System.out.println(j);
                if (j == 4) {
                    break outer;
                }
            }
        }
    }
}
