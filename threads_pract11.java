// WE can pass that in place of super also thats called without argument 

class MyThread extends Thread {

    MyThread() {
        super("Ishan(No Args)");
    }

    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }
}

class Methods {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }
}
