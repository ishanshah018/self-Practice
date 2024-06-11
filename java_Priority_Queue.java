import java.util.*;

class PRQ {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq.add(5);
        pq.add(3);
        pq.add(2);
        pq.add(1);
        pq.add(8);
        pq.add(7);
        pq.add(15);
        pq.add(23);
        pq.add(12);
        pq.add(27);
        pq.add(1);
        pq.add(11);
        pq.add(6);

        pq.poll();
        System.out.println(pq.peek());
        System.out.println(pq);

        System.out.println("Size" + pq.size());

        System.out.println(pq.element());
    }
}
