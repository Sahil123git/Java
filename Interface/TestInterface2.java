interface Shape {

    void compArea();// defination of method

}

class Rectangle implements Shape {
    double dim1, dim2;

    Rectangle(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public void compArea() {
        System.out.println("Area of Rectangle = " + dim1 * dim2);
    }

    public void show() {
        System.out.println("dims of Rectangle = " + dim1 + " " + dim2);
    }

}

class Triangle implements Shape {
    double hei, base;

    Triangle(double hei, double base) {
        this.hei = hei;
        this.base = base;
    }

    public void compArea() {
        System.out.println("Area of Triangle = " + 0.5 * base * hei);
    }

}

public class TestInterface2 {

    public static void main(String args[]) {
        Rectangle r1 = new Rectangle(25, 15);

        Shape s1; // declaring reference of SHape
        s1 = r1;
        s1.compArea();
        // s1.show(); will give error
        Triangle t1 = new Triangle(12, 10);

        s1 = t1;
        s1.compArea();

        // or
        s1 = new Triangle(10, 23);//direct trick constructor will set values
        s1.compArea();
    }
}