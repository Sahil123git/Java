class GensDemo {
    private double val;

    <T extends Number> GensDemo(T arg) {
        val = arg.doubleValue();
    }

    void showval() {
        System.out.println("val: " + val);
    }

    <T extends Number> T getVal(T arg) {// method with return type
        return arg;
    }
}

public class GenConstructor {
    public static void main(String args[]) {
        GensDemo test = new GensDemo(100);
        GensDemo test2 = new GensDemo(123.5F);
        test.showval();
        System.out.println(test.getVal(23));

        test2.showval();

    }
}
