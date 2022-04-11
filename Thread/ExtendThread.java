// 2 ways to create thread :

// extend the Thread class
// implement the Runnable Interface

// 1-10, default 5

class MyThread extends Thread {
    String name;

    MyThread(String name) {
        this.name = name;
        start();
    }

    public void run() {// Only method of Thread called by start method
        for (int i = 0; i < 5; i++) {// executed by t1's thread
            System.out.println(name + " " + i);
            try {
                Thread.sleep(80);
            } catch (InterruptedException ie) {
            }
        }

    }

}

class ExtendThread {

    public static void main(String arg[]) {
        MyThread ref = new MyThread("one");// creating thread
        // ref.start(); //can call for start from here for thread one
        try {
            ref.join();// first ref thread will end then any other thread can start
            // ref.join() means now it will first finish ref thread if other thread is running it
            // will stop that and first finish this
        } catch (InterruptedExceptiosn j) {

        }
        new MyThread("two");
        // or new MyThread("Two").start();// or like this
        for (int i = 0; i < 5; i++) {// will be executed by Main thread
            try {
                System.out.println("main " + i);
                Thread.sleep(200);
            } catch (InterruptedException x) {
            }
        }

    }
}
