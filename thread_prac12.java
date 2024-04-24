//Thread.yield(); method

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}

class Demo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for (int i = 0; i <= 5; i++) {
            System.out.println("Main Thread");
        }
    }
}
