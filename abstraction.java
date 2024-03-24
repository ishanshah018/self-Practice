//UNDERSTANDING CONCEPT OF ABSTRACTION.

abstract class Shape {
    abstract void display();// Abstract method does not have any implementation

    abstract void area(int a);

    void show()// Regular Method
    {
        System.out.println("Hello");
    }
}

class Rectangle extends Shape {
    void display()// implementation abstract method
    {
        System.out.println("Rectangle");
    }

    void area(int b)// implementation abstract method
    {
        System.out.println("Rectangle area");
    }
}

class Circle extends Shape {
    void display()// implementation abstract method
    {
        System.out.println("Circle");
    }

    void area(int b)// implementation abstract method
    {
        System.out.println("Circle area");
    }
}

class Main {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.display();
        s.area(10);
        s.show();
        Shape s1 = new Circle();
        s1.display();
        s1.area(10);
        s1.show();
    }
}
