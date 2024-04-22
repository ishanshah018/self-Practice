class MyThread extends Thread {
    public void run() {
        System.out.println("Child Thread");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        mt1.start(); // This method is of Thread class
        /*
         * In the case of start method a new thread is created which is responsible for
         * the execution of run method
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
