//Implementing Runnable and Getting and setting name of Threads

class MyThread implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }
}

class Methods {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt, "Ishan");
        t.start();
    }
}
