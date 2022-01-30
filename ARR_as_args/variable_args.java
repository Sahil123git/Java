
class variable_args {

    void meth(String a) {// here string as formal parameter
        System.out.println("Variable ");
    }

    void meth(String... a) {
        System.out.println("Variable number of arguements");
        for (String x : a)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String... args) {
        variable_args t1 = new variable_args();
        t1.meth("hello", "how", "are", "you");// actual parameters
        t1.meth("hello");// it is clear tht 1 string and we are alos having 1 method with 1 string as formal parameter
        t1.meth();

    }
}
