//Take an array as input from the user.Search for a given number x and print the index at which it occurs.
//Linear Search


import java.util.*;

class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();

        // for loop to take inputs
        System.out.println("Enter " + size + " numbers");
        int num[] = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Enter any number you have to find: ");
        int x = sc.nextInt();

        // for loop to show output
        for (int i = 0; i < size; i++) {
            if (num[i] == x) {
                System.out.println("x found at index :" + i);
            }
        }
    }
}
