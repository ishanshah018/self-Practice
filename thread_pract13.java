/* 
This code showcases how to create a separate thread, execute a task within it, 
and using t.join() the main thread to wait for the child thread to complete before continuing.
*/

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}

class Methods {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        try {
            t.join();
        } catch (Exception e) {

        }

        for (int i = 0; i <= 5; i++) {
            System.out.println("Main Thread");
        }
    }
}
