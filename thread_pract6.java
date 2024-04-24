//Just like pract_5 ques but we have added super.start in start method (regular) it will call the run method that means thread  is started now and here both thread of main class and child class will works.
class MyThread extends Thread {
    public void start() {
        super.start();
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
