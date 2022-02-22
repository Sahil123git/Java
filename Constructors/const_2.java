class const_2 {
    int a, b;

    const_2() {
        a = b = 10;
    }

    const_2(int c) {
        a = b = c;
    }

    const_2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    const_2(const_2 t) {
        this.a = t.a;
        this.b = t.b;
    }

    void print() {
        System.out.println(a + " " + b);
    }

    public static void main(String[] arg) {
        const_2 t1 = new const_2();
        const_2 t2 = new const_2(13);
        const_2 t3 = new const_2(15, 25);
        const_2 t4 = new const_2(t3);
        t1.print();
        t2.print();
        t3.print();
        t4.print();
    }
}