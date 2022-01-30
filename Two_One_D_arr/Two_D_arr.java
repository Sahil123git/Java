public class Two_D_arr {
    public static void main(String[] args) {
        int arr[][] = new int[4][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j + 1;
            }
        }

        for (int it[] : arr) {
            for (int iter : it) {
                System.out.print(iter);
            }
            System.out.println();
        }
        System.out.println();

        int arr2[][] = { { 1, 2 }, { 3, 4, 5,8 } };
        for (int it[] : arr2) {
            for (int iter : it) {
                System.out.print(iter);
            }
            System.out.println();
        }
    }
}