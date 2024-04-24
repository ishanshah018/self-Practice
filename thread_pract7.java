//Getting name of Thread

class MyThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("Child Thread is: " + t);
    }
}

class Methods {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println("Main Thread is: " + t);

        MyThread mt = new MyThread();
        mt.start();

    }
}
