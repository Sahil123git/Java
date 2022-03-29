abstract class Shape {// cannot create obj of abstract class also
    double dim1, dim2;

    Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract void compArea();

    void show() {
        System.out.println("dimensions are : " + dim1 + " " + dim2);
    }
}

class Rectangle extends Shape {

    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public void compArea() {
        System.out.println("Area is : " + dim1 * dim2);
    }

}

class Triangle extends Shape {
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public void compArea() {
        System.out.println("Area is : " + 0.5 * dim1 * dim2);
    }
}

class Test_abs_1 {
    public static void main(String args[]) {
        Shape s1;

        Rectangle r1 = new Rectangle(15, 13);
        
        s1 = r1;
        s1.compArea();

        s1 = new Triangle(12, 34);
        s1.compArea();
    }

}