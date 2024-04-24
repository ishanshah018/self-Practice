//Getting and Setting Name of Thread

class MyThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("Child Thread is: " + t.getName());
    }
}

class Methods {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("Ishan's Thread"); // We made Custom Thread
        System.out.println(mt.getName()); // Gives name of custom Thread which we had made

        Thread t = Thread.currentThread();
        System.out.println("Main Thread is: " + t.getName()); // Gives name of Main Thread

        mt.start();

    }
}
