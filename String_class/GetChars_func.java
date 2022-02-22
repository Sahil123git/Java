class GetChars_func {

    public static void main(String args[]) {

        String s = "welcome to programming in Java";

        char ch[] = new char[20];
        // 1st arg is st index of s
        // 2nd arg is end ind of s
        // 3rd arg is character arr
        // 4th arg is dest index for char arr
        s.getChars(0, 6, ch, 0);// 0,1,2,3,4,5

        s.getChars(8, 15, ch, 6);

        s.getChars(17, 20, ch, 8);
        for (char c : ch)
            System.out.print(c);

    }
}