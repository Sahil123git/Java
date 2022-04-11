class Thread1 extends Thread {// 1st method to create thread
    @Override // this will act as comment becoz we are overriding run method
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            try {
                Thread.sleep(80);
                System.out.println("Thread 1: " + i);
            } catch (InterruptedException ex) {

            }
        }
    }
}

class Thread2 implements Runnable {// 2nd method to create thread
    @Override
    public void run() {
        for (int i = 99; i >= 1; i -= 2) {
            try {
                Thread.sleep(70);
                System.out.println("Thread 2: " + i);
            } catch (InterruptedException ex) {

            }
        }
    }
}

public class OddEvenThread {
    public static void main(String[] args) {

        Thread1 ref1 = new Thread1();
        ref1.start();
        try {
            ref1.join();
        } catch (InterruptedException ex) {

        }
        new Thread(new Thread2()).start();

    }
}
