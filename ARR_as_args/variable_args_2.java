class variable_args_2 {

    void meth(String a) {// here string as formal parameter
        System.out.println("Variable ");
    }

    void meth(String[]... a) {
        System.out.println("Variable number of arguements");
        for (String x[] : a) {
            for (String i : x) {// prntng string 1 by one
                System.out.println(i);
            }
        }

        System.out.println();
    }

    public static void main(String... args) {
        variable_args_2 t1 = new variable_args_2();

        String[] st = new String[] { "sahil", "rj" }, st1 = new String[] { "sal", "rj" };

        t1.meth(st, st1);// actual parameters
        t1.meth("hello");// it is clear tht 1 string and we are alos having 1 method with 1 string as
                         // formal parameter
        t1.meth();

    }
}
