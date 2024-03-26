import java.util.*;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i = a[5];
        System.out.println(i);
    }
}

/* If we enter n less than 5 than exception : 
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
Index 5 out of bounds for length 4 */
