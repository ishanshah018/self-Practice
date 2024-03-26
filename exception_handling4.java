import java.util.*;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array ");
        int n = sc.nextInt();
        try {
            int a[] = new int[n];
            int i = a[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Hi");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Hello");
        }
    }
}
