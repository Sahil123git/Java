public class LambdaAnonymousThread {
    public static void main(String[] args) {
        Runnable t1 = () -> {// using lambda expresssion
            for (int i = 2; i < 101; i += 2) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ie) {
                }
            }

        };
        new Thread(t1).start();

        new Thread(new Runnable() {// Using Anonymous class
            public void run() {
                for (int i = 99; i >= 1; i -= 2) {
                    try {
                        Thread.sleep(70);
                        System.out.println("Thread 2: " + i);
                    } catch (InterruptedException ex) {
                    }
                }
            }
        }).start();
    }
}
