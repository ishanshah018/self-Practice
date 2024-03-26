// Use of try catch finally

class B {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Final Block..");
        }
    }
}

/* Output: java.lang.ArithmeticException: / by zero
Final Block..*/
