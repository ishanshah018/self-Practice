
//Stack functions
/*
 push()
 pop()--returns eleemnt and removes
 peek()--returns top element
 search()--gives offset of elements from otop
 */
import java.util.*;

class Collection4 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(10);
        s1.push(40);

        System.out.println(s1);

        System.out.println(s1.pop());
        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1.search(10));
        System.out.println(s1.indexOf(10));
    }
}
