class MyThread extends Thread {
    String name;

    MyThread(String name) {
        this.name = name;
        // start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
            }
        }

    }

}

class MyThread2 implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(" " + i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException ie) {
            }
        }
    }
}

class RunnableThread {

    public static void main(String ar[]) {

        MyThread t1 = new MyThread("one");
        t1.start();
        new MyThread("two").start();
        MyThread t3 = new MyThread("Three");
        t3.start();

        new Thread(new MyThread2()).start();// for 2nd mthd Runnable Thread
        // MyThread2 myt = new Mythread();
        // Thread t4 = new Thread(myt);//another method for Runnable interface

        System.out.println("t1 is alive ? " + t1.isAlive());
        try {
            t1.join();
            t3.join();
        } catch (InterruptedException ie) {
        }

        System.out.println("t1 is alive ? " + t1.isAlive());
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("main " + i);
                Thread.sleep(100);
            } catch (InterruptedException ie) {
            }
        }

    }
}