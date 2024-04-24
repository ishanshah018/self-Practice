/* When we make start method than our start method will be executed just like a normal method .
Produced by only Main Thread no Child Thread worked here */


class MyThread extends Thread {
    public void start() {
        System.out.println("Start Method");
    }

    public void run() {
        System.out.println("Run Method");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        System.out.println("Main Method");
    }
}

//It's not recommended to override start method in child class of Thread 
