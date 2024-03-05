//WAP IN JAVA TO PRINT SUM OF 1 TO N NUMBERS. USING SCANNER CLASS

import java.util.*;

class recursion {
    void printsum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println("Sum of " + n + " numbers is: " + sum);
            return;
        }
        sum += i;
        printsum(i + 1, n, sum);

    }

    public static void main(String[] args) {
        recursion r = new recursion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first digit to start(i)");
        int i = sc.nextInt();

        System.out.println("Enter last digit to end(n)");
        int n = sc.nextInt();
        r.printsum(i, n, 0);
    }
}
