// Methods of Collection Interface

import java.util.*;

class Collection2 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList();
        ArrayList a4 = new ArrayList<>();

        System.out.println(a1.add(10)); // Returns Boolean Value
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);
        System.out.println(a1);

        a2.add(10);
        a2.add(25);
        a2.add(30);
        a2.add(35);
        a2.add(55);
        System.out.println(a2);

        a3.add(1);
        a3.add(2);
        a3.add(3);
        a3.add(4);
        System.out.println(a3);

        a4.add("Hi");
        a4.add(true);
        a4.add('c');
        a4.add(2.5);
        System.out.println(a4);

        // a1.add(a2); //Gives Error
        // error: incompatible types: ArrayList<Integer> cannot be converted to Integer

        a4.add(a2);
        System.out.println(a4);

        a1.addAll(a2);
        System.out.println(a1);

        a1.addAll(2, a3);
        System.out.println(a1);

        System.out.println(a3.contains(3));
        System.out.println(a1.contains(a3));

        System.out.println(a1);
        a1.removeAll(a3);
        System.out.println(a1);
        a1.removeAll(a2);
        System.out.println(a1);

        System.out.println("________________________________________");

        // Print a1 using [Object Array]

        Object ob[] = a1.toArray();
        for (Object ob1 : ob) {
            System.out.println(ob1);
        }

        System.out.println("________________________________________");

        // Print a1 using {Iteration Method}

        Iterator itr = a1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
