public class Box_arr {

    double length, width, height;

    Box_arr() {
        length = width = height = 0;
        System.out.println("Welcome to class Box_arr");
    }

    Box_arr(double d) {
        this();
        length = width = height = d;
    }

    Box_arr(double length, double width, double height) {
        this();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box_arr(Box_arr b) {
        this();
        this.length = b.length;
        this.width = b.width;
        this.height = b.height;
    }

    double volume() {
        // System.out.println(length*width*height);
        return length * width * height;
    }

    static Box_arr addBox_arres(Box_arr b1, Box_arr b2) {
        return new Box_arr(b1.length + b2.length, b1.width + b2.width, b1.height + b2.height);
    }

    public static void main(String args[]) {
        /*
         * Box_arr b1= new Box_arr();
         * Box_arr b2= new Box_arr(12);
         * Box_arr b3= new Box_arr(10,15,20);
         * Box_arr b4= new Box_arr(b3);
         * Box_arr b5= Box_arr.addBox_arres(b2,b4);
         * 
         * //b1.volume(); b2.volume(); b3.volume();b4.volume();b5.volume();
         */
        int[] arr = new int[5];
        Box_arr[] bs = new Box_arr[5]; // array of reference variables default is null

        bs[0] = new Box_arr(55);
        bs[1] = new Box_arr();
        bs[2] = new Box_arr(5, 10, 15);
        bs[3] = new Box_arr(bs[2]);
        bs[4] = new Box_arr(100);

        for (Box_arr x : bs)
            System.out.println(x.volume());

    }
}
