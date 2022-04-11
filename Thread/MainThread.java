// 1-10, default 5
public class MainThread {
    public static void main(String... args) {
        Thread t = Thread.currentThread();// creating thread
        System.out.println(t);

        for (int i = 0; i < 4; i++) {// this all will be executed by Main thread
            try {
                System.out.println(i);
                Thread.sleep(100);// sleep(wait) for 100 milliseconds
            } catch (InterruptedException e) {

            }
        }
        t.setName("MyThread");
        t.setPriority(3);// but bydefault it is 5
        System.out.println(t);
    }
}
