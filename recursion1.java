//print numbers from 5 to 1 using recursion

class recursion {
    public static void main(String[] args) {
        int n = 5;
        recursion ab = new recursion();
        ab.printnum(n);

    }

    void printnum(int n) {
        if (n == 0) {  //base case
            return;
        }
        System.out.println(n);
        printnum(n - 1);    //recursion

    }
}
