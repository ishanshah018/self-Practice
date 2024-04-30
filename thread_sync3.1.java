class Display {
    public static synchronized void wish(String name) {  //Here we added static bcoz two different display methods are made which made the thread execution irregular if static is not applied
        for (int i = 0; i < 5; i++) {
            System.out.println("Good Morning ");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.println(name);
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

class Synchronized {
    public static void main(String[] args) {
        Display d1 = new Display();
        Display d2 = new Display();

        MyThread t1 = new MyThread(d1, "Dhoni");
        MyThread t2 = new MyThread(d2, "Kohli");

        t1.start();
        t2.start();
    }
}
