public class SingleClassMthd {
    int rollno;
    String name;

    SingleClassMthd() {// setting values using default constructor
        rollno = 30;
        name = "rohit";
    }

    void getDetails(int r, String n) {// 1st mthd of setting values
        rollno = r;
        name = n;
    }

    void print() {
        System.out.println(rollno + " " + name);
    }

    int getRollno() {
        return rollno;
    }

    public static void main(String[] args) {

        SingleClassMthd s1 = new SingleClassMthd();
        s1.getDetails(23, "Tanish");
        s1.print();
        int r = s1.getRollno();
        System.out.println(r);
        System.out.println(s1.getRollno());
    }
}