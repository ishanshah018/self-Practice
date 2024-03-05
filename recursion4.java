//Fibonnaci Series using recursion

import java.util.*;

class rec {
    void fibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);

        fibo(b, c, n - 1);

    }

    public static void main(String[] args) {
        int a = 0, b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Fibonnaci Series of " + n + " terms is: ");
        System.out.println(a);
        System.out.println(b);

        rec r = new rec();
        r.fibo(a, b, n - 2);
    }
}
