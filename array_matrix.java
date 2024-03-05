//Matrix using Arrays

import java.util.*;

class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int row = sc.nextInt();
        System.out.println("Enter columns: ");
        int col = sc.nextInt();

        int[][] num = new int[row][col];

        System.out.println("Enter " + row + " row and " + col + " column.");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(num[i][j] + " ");
            }
            System.out.println();

        }
    }
}
