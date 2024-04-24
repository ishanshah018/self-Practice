//By Default No-Arg method will be invoked by start method


class MyThread extends Thread {
    public void run() {
        System.out.println("No Arg");
    }

    public void run(int i) {
        System.out.println("Int Arg");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
