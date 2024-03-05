//Factorial using recursion

import java.util.*;
class rec {
    int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int temp = fact(n - 1);
        int factorial = n * temp;
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");

        int n = sc.nextInt();
        rec r = new rec();
        int ans = r.fact(n);
        System.out.println("Fcatorial is: " + ans);
    }
}
