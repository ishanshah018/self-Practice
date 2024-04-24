// Without over-riding run method in child class we will get empty output..Yes,Code will be compiled✅

class MyThread extends Thread {

}

class ThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
