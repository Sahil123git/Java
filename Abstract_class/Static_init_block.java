abstract class Shape {
    double dim1, dim2;

    Shape() {
    }

    Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract void compArea();

    void show() {
        System.out.println("dimensions are : " + dim1 + " " + dim2);
    }

    static {
        System.out.println("static block shape getting called");
    }

    {
        System.out.println("non static init block 1 of shape getting called");

    }
    {
        System.out.println("non static init block 2 of shape getting called");

    }
}

class Rectangle extends Shape {

    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public void compArea() {
        System.out.println("Area is : " + dim1 * dim2);
    }

    static {
        System.out.println("static block of rectangle \"getting called");
    }

}

class Triangle extends Shape {
    Triangle(double dim1, double dim2) {
        // super(dim1,dim2);
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public void compArea() {
        System.out.println("Area is Triangle: " + 0.5 * dim1 * dim2);
    }

    static {
        System.out.println("static block of triangle getting called");
    }
}

public class Static_init_block {
    public static void main(String args[]) {
        Shape s1;

        Rectangle r1 = new Rectangle(15, 13);

        r1.compArea();
        s1 = r1;
        s1.compArea();
        s1 = new Triangle(12, 14);
        s1.compArea();

    }

}
/*
 * Static block 1 per class
 * while non static init class when ever new (or obj) is created then it will
 * get called
 */