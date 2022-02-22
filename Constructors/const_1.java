//Predict the output of the following program.

class const_1 {
    int a, b;

    // const_1() {//we have to write this to execute const_1()
    //     a = b = 10;
    // }

    const_1(int c) {
        a = b = c;
    }

    void print() {
        System.out.println(a + " " + b);
    }

    public static void main(String[] arg) {

        const_1 t1 = new const_1();
        const_1 t2 = new const_1(13);
        t1.print();
        t2.print();
    }
}

class aj {

}