//Multiple Inheritance using interface in java

interface in1 {
    default void show() {
        System.out.println("In1");
    }
}

interface in2 {
    default void show() {
        System.out.println("In2");
    }
}

class Test implements in1, in2 {
    public void show() {
        System.out.println("Hi Test");
    }

    public void showIn1() {
        in1.super.show(); // to call parent in1 class show
    }

    public void showIn2() {
        in2.super.show(); // to call parent in2 class show
    }
}

class Main {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        t.showIn1();
        t.showIn2();

        System.out.println();

        in1 i1 = new Test();
        i1.show();
        in2 i2 = new Test();
        i2.show();
    }
}
