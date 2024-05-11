//Methods of Collections class... All Methods are Static

import java.util.*;

class Collections6 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();

        a1.add(54);
        a1.add(76);
        a1.add(-4);
        a1.add(04);
        a1.add(354);
        a1.add(-254);
        System.out.println(a1);

        System.out.println(Collections.max(a1));
        System.out.println(Collections.min(a1));

        Collections.sort(a1);
        System.out.println(a1);

        Collections.reverse(a1);
        System.out.println(a1);

        a1.add(7);
        a1.add(7);
        a1.add(-4);

        System.out.println(Collections.frequency(a1, 7));
        System.out.println(Collections.frequency(a1, -4));
        System.out.println(Collections.frequency(a1, 100));
        System.out.println(Collections.frequency(a1, 76));
    }
}
