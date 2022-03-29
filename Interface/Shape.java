interface Inter_shape {
    int dim1 = 10, dim2 = 20;

    int computeArea();// defining method

}

public class Shape implements Inter_shape {
    int dim1, dim2;

    Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public int computeArea() {// implementing here
        return dim1 * dim2;
    }

    public static void main(String[] args) {
        Shape r1 = new Shape(12, 34);

        System.out.println(r1.computeArea());
    }
}

// ------------------------------
// interface Shape {

// double dim1 = 10, dim2 = 20;

// double ComputeArea();
// }

// class Rectangle implements Shape {

// public double ComputeArea() {
// return dim1 * dim2;
// }

// public static void main(String[] args) {
// Rectangle r1 = new Rectangle();

// System.out.println(r1.ComputeArea());
// }

// }
