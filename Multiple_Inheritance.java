//Code of Multiple Inheritance using Interface in java

interface circle {
    double arcircle(int r);
}

interface square {
    double arsquare(int l);
}

class shape implements circle, square {
    public double arcircle(int r) {
        return 3.14 * r * r;
    }

    public double arsquare(int l) {
        return l * l;
    }
}

class Main {
    public static void main(String[] args) {
        shape s = new shape();
        System.out.println("Area of Circle is: " + s.arcircle(2));
        System.out.println("Area of Square is: " + s.arsquare(5));

    }
}
