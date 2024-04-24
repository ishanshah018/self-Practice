//Used sleep method in child class
//Child class will go for sleep than also main thread will wait until it will print all of its than the main thread will be implemented

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            System.out.println("Child Thread");

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
