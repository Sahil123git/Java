public class box_vol {
    double height, width, length;

    box_vol() {
        height = width = length = 0.00;
    }

    box_vol(double len, double hei, double wid) {
        length = len;
        height = hei;
        width = wid;
    }

    box_vol(box_vol vol) {
        this.width = vol.width;
        this.length = vol.length;
        this.height = vol.height;
    }

    box_vol addBoxes(box_vol b1, box_vol b2) {

        box_vol b3 = new box_vol();
        b3.height = b1.height + b2.height;
        b3.width = b1.width + b2.width;
        b3.length = b1.length + b2.length;
        return b3;
    }

    static boolean fits_in(box_vol b1, box_vol b2) {
        if (b1.length < b2.length && b1.height < b2.height && b1.width < b2.width) {
            return true;
        }
        return false;
    }

    void print() {
        System.out.println("VOL of box is " + (width * length * height));
    }

    public static void main(String[] arg) {
        box_vol t1 = new box_vol();
        box_vol t2 = new box_vol(13, 45, 12);
        box_vol t3 = new box_vol(t1);
        box_vol t4 = t1.addBoxes(t3, t2);
        boolean b1 = box_vol.fits_in(t3, t2);// static method so call using class name
        System.out.println(b1);

        t1.print();
        t2.print();
        t3.print();
        t4.print();

    }
}
/*
 * Ques
 * create a class Box having attributes length, width and height.
 * add a method to compute volume of the Box.
 * add the constructors default , 1 arguement and 3 arguement constructor
 * Also add 1 constructor which will accept refernece of an existing Box
 * 
 * introduce a method addBoxes
 * Box addBoxes(Box b1, Box b2);
 * 
 * static boolean fitsInto(Box b1, Box b2)
 * true if b1 fits into b2
 */
