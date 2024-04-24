//ByImplementing Runnable Inteface 

class MyRunnable implements Runnable {

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Child Thread");
        }
    }
}

class ThreadDemo {
    public static void main(String[] args) {does not have any start method
        MyRunnable r = new MyRunnable(); // Made the MyRunnable class object we cant do r.start because Runnable 
        Thread t = new Thread(r); //we have to pass target object in Thread Method Object
        t.start();
        for (int i = 0; i <= 10; i++) {
            System.out.println("Main Method");
        }
    }
}
