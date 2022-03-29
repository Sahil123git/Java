
final class TestFinal {
    int x = 10;
    final int y = 20;
    static int z = 25;

    /*
     * final void show()
     * {
     * System.out.println("TestFinal version");
     * }
     */
}

class TestFinalChild extends TestFinal {
    void show() {
        System.out.println("TestFinalChild version");
    }
}

public class FinalExPD {

    public static void main(String args[]) {
        TestFinal tf = new TestFinal();
        tf.x = 50;
        // tf.y=60; cannot reassign final
        tf.z = 70;
    }
}