class Box_dim {

    double length, width, height;

    Box_dim() {
        length = width = height = 0;
        System.out.println("Welcome to class Box_dim");
    }

    Box_dim(double d) {
        this();
        length = width = height = d;
    }

    Box_dim(double length, double width, double height) {
        this();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box_dim(Box_dim b) {
        this();
        this.length = b.length;
        this.width = b.width;
        this.height = b.height;
    }

    double volume() {
        // System.out.println(length*width*height);
        return length * width * height;
    }

    static Box_dim addBox_dimes(Box_dim b1, Box_dim b2) {
        return new Box_dim(b1.length + b2.length, b1.width + b2.width, b1.height + b2.height);
    }

    public String toString() {
        return " This is Box_dim class Object having dimensions " + length + " " + width + " " + height;
    }

    public static void main(String args[]) {

        int[] arr = new int[5];
        Box_dim[] bs = new Box_dim[5]; // array of reference variables default is null

        bs[0] = new Box_dim(55);
        bs[1] = new Box_dim();
        bs[2] = new Box_dim(5, 10, 15);
        bs[3] = new Box_dim(bs[2]);
        bs[4] = new Box_dim(100);

        for (Box_dim x : bs)
            System.out.println(x);

        BoxWeight var = new BoxWeight(12.2, 34, 45, 12);
        System.out.println(var);
    }
}

class BoxWeight extends Box_dim {
    double weight;

    
    BoxWeight(double weight, double height, double width, double length) {
        super(length, width, height);
        this.weight = weight;
    }

    public String toString() {// this is overriding
        return " This is Box_dim class Object having dimensions " + length + " " + width + " " + height + " " + weight
                + "done ";
    }
}