
// Linked List Functions
import java.util.*;

class Collection3 {
    public static void main(String[] args) {
        LinkedList<Double> l1 = new LinkedList<Double>();

        l1.add(2.5);
        l1.add(3.5);
        l1.add(4.5);
        l1.add(1.5);
        l1.add(0.5);

        System.out.println(l1);

        System.out.println(l1.get(2));
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
        l1.addFirst(5.0);
        l1.addLast(6.0);
        System.out.println(l1);

        l1.removeFirst();
        l1.removeLast();
        System.out.println(l1);
    }
}
