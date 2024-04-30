//Inter Thread Communication

class MyThread extends Thread {
    int total;

    public void run() {
        System.out.println("Child Thread starts Calculation ");
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                total = total + i;
            }
            System.out.println("Child Thread tries to give notification");
            this.notify();
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        synchronized (t) {
            try {
                System.out.println("Main Thread is Waiting ");
                t.wait();
                System.out.println("Main Thread gets Notification..");
            } catch (Exception e) {

            }
        }
        System.out.println(t.total);
    }
}

/*

This code is all about teamwork! The main thread needs the child thread to complete
its calculation before it can continue. Using wait() and notify()
lets them communicate and keeps everything running smoothly.*/
