// Differernt Methods to handle Exception(to display exception)

class A {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(1);
            System.out.println(2 / 0);
            System.out.println(3);
        } catch (ArithmeticException e) {
            System.out.println(e); // to get name:description
            System.out.println(e.toString()); // same as e
            System.out.println(e.getMessage()); // to get description of exception
            e.printStackTrace();

        }
        System.out.println(6);
        System.out.println(7);
    }
}

/*
  OUTPUT:-
  1
  2
  1
  java.lang.ArithmeticException: / by zero
  java.lang.ArithmeticException: / by zero
  / by zero
  java.lang.ArithmeticException: / by zero
  at A.main(ex13.java:9)
  6
  7
 */
