//WAP Which Prints odd and even number from 1 to 10 using thread
//Condition:- First Odd numbers should be printed and than even.

class Odd extends Thread {
    public void run() {
        System.out.println("----------Odd----------");
        for (int i = 1; i <= 5; i++) {
            if (i % 2 != 0) {
                System.out.println(i); // Prints Odd Number
            }
        }
    }
}

class Even extends Thread {
    public void run() {
        System.out.println("----------Even----------");
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                System.out.println(i); // Prints Even Number
            }
        }
    }
}

class Demo {
    public static void main(String[] args) {
        Odd o = new Odd();
        Even e = new Even();

        o.start();

        try {
            o.join();
        } catch (Exception e1) {

        }
        e.start();
    }
}
