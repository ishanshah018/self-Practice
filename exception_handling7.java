class B {
    public static void main(String[] args) {
        System.out.println(m1());
    }

    public static int m1() {
        try {
            System.out.println("Try Executed");
            return 777;
        } catch (Exception e) {
            System.out.println("Catch Executed");
            return 888;
        } finally {
            System.out.println("Finally executed");
            return 999;
        }
    }
}

/* OUTPUT;
 Try Executed
Finally executed
999
 */
