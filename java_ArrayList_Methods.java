// METHODS OF ARRAYLIST

import java.util.*;

class Collection1 {
    public static void main(String[] args) {
        // ArrayList for Non-Homogeneous data
        // Constructor 1

        ArrayList a1 = new ArrayList();
        a1.add("Hello");
        a1.add(12);
        a1.add(15.23);
        a1.add(11l);
        a1.add('c');
        a1.add(true);
        a1.add(null);

        System.out.println(a1);
        System.out.println("__________________________________");

        // ArrayList for Homogeneous data
        // Constructor 2

        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(10);
        a2.add(20);
        a2.add(30);
        a2.add(40);
        a2.add(10);
        System.out.println(a2);

        // void add(int Index,Ee) ADDS ELEMENT AT PARTICULAR INDEX
        a2.add(2, 25);
        System.out.println(a2);
        System.out.println("________________________________");

        // Constructor 3
        ArrayList<Integer> a3 = new ArrayList<Integer>(a2);
        System.out.println(a3);

        // void clear()
        System.out.println(a1);
        System.out.println(a2);
        a1.clear();
        System.out.println(a1);

        // boolean isEmpty()
        System.out.println(a1.isEmpty());
        System.out.println(a2.isEmpty());
        System.out.println("__________________________________");

        // Constructor 4

        ArrayList<Integer> a4 = new ArrayList<Integer>(5);
        a4.ensureCapacity(10);

        // E get(int index)
        System.out.println(a2.get(3));

        // E set(int index)
        System.out.println(a2.set(3, 90));
        System.out.println(a2);

        System.out.println(a2.indexOf(20)); // gives index of an element 20
        System.out.println(a2.lastIndexOf(10)); // gives index of an element 10 which is last fetched.

        a2.sort(Comparator.naturalOrder());
        System.out.println(a2);

        a2.sort(Comparator.reverseOrder());
        System.out.println(a2);
        System.out.println("__________________________________");

        // Constructor 5

        ArrayList<String> a5 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));
        for (String s : a5) {
            System.out.println(s);
        }
        System.out.println(a5);
    }
}
