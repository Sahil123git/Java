public class Box_arr_2 {

    double length, width, height;

    Box_arr_2() {
        length = width = height = 0;
        System.out.println("Welcome to class Box_arr_2");
    }

    Box_arr_2(double d) {
        this();
        length = width = height = d;
    }

    Box_arr_2(double length, double width, double height) {
        this();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box_arr_2(Box_arr_2 b) {
        this();
        this.length = b.length;
        this.width = b.width;
        this.height = b.height;
    }

    double volume() {
        // System.out.println(length*width*height);
        return length * width * height;
    }

    static Box_arr_2 addBox_arr_2es(Box_arr_2 b1, Box_arr_2 b2) {
        return new Box_arr_2(b1.length + b2.length, b1.width + b2.width, b1.height + b2.height);
    }

    public static void main(String args[]) {

        Box_arr_2[] bs = new Box_arr_2[5];// arr of ref var default value null

        for (int i = 0; i < bs.length; i++)// bs.length=5 (0 to 4)
            bs[i] = new Box_arr_2(i + 20);

        for (Box_arr_2 x : bs)
            System.out.println(x.volume());

    }
}
