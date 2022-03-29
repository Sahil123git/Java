abstract class Shape {
    double dim1, dim2;

    Shape() {
        System.out.println("shape class default constructor");
    }

    Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
        System.out.println("shape class constructor");
    }

    abstract void compArea();

    void show() {
        System.out.println("dimensions are : " + dim1 + " " + dim2);
    }

    static {
        System.out.println("static block shape getting called");
    }

    {// init block will be called when obj will be created
        System.out.println("non static init block 1 of shape getting called");

    }
    {
        System.out.println("non static init block 2 of shape getting called");

    }
}

class Rectangle extends Shape {

    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
        System.out.println("rectangle class constructor");
    }

    public void compArea() {
        System.out.println("Area is : " + dim1 * dim2);
    }

    static {
        System.out.println("static block of rectangle getting called");
    }

}

class Triangle extends Shape {
    Triangle(double dim1, double dim2) {
        // super(dim1,dim2);
        this.dim1 = dim1;
        this.dim2 = dim2;
        System.out.println("triangle class constructor");
    }

    public void compArea() {
        System.out.println("Area is Triangle: " + 0.5 * dim1 * dim2);
    }

    static {
        System.out.println("static block of triangle getting called");
    }
    {
        System.out.println("non static init block 1 of triangle getting called");

    }
    {
        System.out.println("non static init block 2 of triangle getting called");

    }
}

public class Static_init_block_2 {
    public static void main(String args[]) {
        Shape s1;

        Rectangle r1 = new Rectangle(15, 13);

        s1 = r1;
        s1.compArea();
        s1 = new Triangle(12, 14);
        s1.compArea();

    }

}