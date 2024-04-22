class MyThread extends Thread {
    public void run() {
        System.out.println("Run Method");
    }

    public void start() {
        super.start();
        System.out.println("Start Method");
    }

}

class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        mt1.start(); // This method is of Thread class

        System.out.println("Main Thread");
    }

}
