//Synchronized-Block

class Display {
    void wish(String name) {
        synchronized (Display.class) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Good Morning");

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }
                System.out.println(name);
            }
        }
    }
}

class MyThread extends Thread {
    Display d;
    String name;

    MyThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.wish(name);
    }
}

class sync {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "Dhoni");
        MyThread t2 = new MyThread(d, "Rohit-man");

        t1.start();
        t2.start();
    }
}
