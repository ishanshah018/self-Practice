//isAlive()

class MyThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.isAlive());
    }
}

class Methods {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        MyThread mt = new MyThread();
        System.out.println(mt.isAlive());

        mt.start();

        try {
            mt.join();
        } catch (Exception e) {

        }

        System.out.println(mt.isAlive());

        System.out.println("Main Thread");

        System.out.println(t.isAlive());
    }
}
//Output:-
/*
false
true
false
Main Thread
true
*/
