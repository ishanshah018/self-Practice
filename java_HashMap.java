import java.util.*;
import java.util.Map.Entry;

class Hsh {
    public static void main(String[] args) {
        HashMap h1 = new HashMap();
        HashMap<Integer, String> h2 = new HashMap<>();

        System.out.println(h1.put(45, "MI"));
        h1.put(7, "CSK");
        h1.put(3, "KKR");
        h1.put(18, "RCB");

        System.out.println(h1.values());

        System.out.println(h1.keySet());

        h2.putAll(h1);
        System.out.println(h2.values());

        System.out.println(h1);
        System.out.println(h2);

        System.out.println(h2.remove(3)); // returns removed value
        System.out.println(h2);

        System.out.println(h2.remove(2)); // returns null as key:2 is not present.

        System.out.println(h2.remove(18, "RCB")); // returns true as this pair exits.
        System.out.println(h2);

        System.out.println(h1.size());

        // h1.merge(3, ",RR", (v1, v2) ->(v1+v2));

        // Display Methods

        Set s = h1.entrySet();
        System.out.println(s);

        // By Iterator method

        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            Map.Entry me = (Map.Entry) itr.next();
            System.out.println(me.getKey() + "->" + me.getValue());
        }

        // foreach loop
    }
}
