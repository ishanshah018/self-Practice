//Extending Thread and making Custom Threads by passing Custom words while making object of that class.

class MyThread extends Thread {

    MyThread(String s) {
        super(s);
    }

    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }
}

class Methods {
    public static void main(String[] args) {
        MyThread mt = new MyThread("Ishan");
        mt.start();
    }
}
