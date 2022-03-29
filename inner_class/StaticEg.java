class Car {
    static int vol = 40;
    private int song_no = 12;

    static class MusicSystem {
        void display() {
            Car ref = new Car();
            System.out.println("vol is " + vol + " song no is " + ref.song_no);
        }
    }

}

public class StaticEg {

    public static void main(String[] args) {
        Car.MusicSystem ref = new Car.MusicSystem();
        ref.display();
    }
}