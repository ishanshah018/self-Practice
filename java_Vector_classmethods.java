// Vector Functions

import java.util.Vector;

class Collection5 {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>(3);
        Vector<Integer> v2 = new Vector<>();
        Vector<Integer> v3 = new Vector<>(2);
        Vector<Integer> v4 = new Vector<>(1, 1);
        Vector<Integer> v5 = new Vector<>();

        System.out.println(v1.capacity());
        v1.add(10);
        v1.add(20);
        v1.add(30);
        System.out.println(v1.capacity());
        v1.add(40);
        System.out.println(v1.capacity());
        System.out.println("_____________________________________________");
        System.out.println(v2.capacity());
        v2.add(10);
        v2.add(20);
        v2.add(30);
        System.out.println(v2.capacity());
        System.out.println("_____________________________________________");
        System.out.println(v3.capacity());
        v3.add(10);
        v3.add(20);
        v3.add(10);
        System.out.println(v3.capacity());
        System.out.println("_____________________________________________");
        System.out.println(v4.capacity());
        v4.add(10);
        System.out.println(v4.capacity());
        v4.add(20);
        System.out.println(v4.capacity());
        System.out.println("_____________________________________________");
        v5.add(10);
        v5.add(20);
        v5.add(30);
        v5.add(40);

        // void element(int Index)
        System.out.println(v5.elementAt(2));
        System.out.println("_____________________________________________");

        Vector<Integer> v6 = new Vector<>(v5);
        System.out.println(v6);
        System.out.println(v5);
        System.out.println(v5.equals(v1));
        System.out.println(v5.equals(v6));

        System.out.println("_____________________________________________");
        Vector<Integer> v7 = (Vector) v4.clone();
        System.out.println(v4);
        System.out.println(v7);
    }
}
