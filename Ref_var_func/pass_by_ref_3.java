class pass_by_ref_3 {
    int a, b;

    pass_by_ref_3() {
        a = 10;
        b = 10;
    }

    pass_by_ref_3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    pass_by_ref_3(pass_by_ref_3 ta) {
        this.a = ta.a;
        this.b = ta.b;
    }

    pass_by_ref_3 meth(pass_by_ref_3 ta) {
        pass_by_ref_3 tn = new pass_by_ref_3();
        tn.a = ta.a + 5;
        tn.b = ta.b - 5;

        return tn;
    }

    public static void main(String args[]) {
        pass_by_ref_3 ta1 = new pass_by_ref_3();
        pass_by_ref_3 ta2 = new pass_by_ref_3(45, 55);
        pass_by_ref_3 ta3 = new pass_by_ref_3(ta1);

        pass_by_ref_3 ta4; // default null
        ta4 = ta1.meth(ta1);
        pass_by_ref_3 ta5 = ta2.meth(ta1);
        ta3.meth(ta4);

    }
}