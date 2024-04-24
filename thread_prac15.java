//Now here Main Thread will only wait for 3 sec and than it will be executed and than remaining child thread will implemented thereafter

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
            t.join(3000);
        } catch (Exception e) {

        }

        for (int i = 0; i <= 5; i++) {
            System.out.println("Main Thread");
        }
    }
}
