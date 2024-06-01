import java.util.*;

class Collection6 {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add(10);
        ad.add(20);
        ad.offer(30);
        ad.offerFirst(5);
        ad.offerLast(35);
        ad.addFirst(4);
        ad.addLast(40);
        System.out.println(ad);

        ad.remove(); // removes element from front
        System.out.println(ad);

        ad.poll(); // removes element from front
        System.out.println(ad);

        System.out.println(ad.peek()); // returns front element

        System.out.println(ad.remove(10)); // removes particular element
        System.out.println(ad);
    }
}
