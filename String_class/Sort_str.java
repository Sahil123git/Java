import java.util.Scanner;

public class Sort_str {
    static void Sort_Str(String[] str) {

        for (int j = 0; j < str.length - 1; j++) {// Bubble sort cncpt
            for (int i = 1; i < str.length - j; i++) {
                if (str[i].compareTo(str[i - 1]) < 0) {// if prv str greater than cur swap
                    String temp = str[i - 1];
                    str[i - 1] = str[i];
                    str[i] = temp;
                }
            }
        }
        for (String s : str) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str_arr = new String[5];

        for (int i = 0; i < 5; i++) {

            str_arr[i] = sc.nextLine();
        }

        Sort_Str(str_arr);
    }
}
