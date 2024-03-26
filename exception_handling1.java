//arithmeticexception

// class ex12 {
//     public static void main(String[] args) {
//         System.out.println(1);
//         System.out.println(2);
//         System.out.println(10 / 0);
//     }
// }

/* error: unreported exception InterruptedException;
 must be caught or declared to be thrown
Thread.sleep(3000)*/

// class ex12 {
//     public static void main(String[] args) {
//         System.out.println(1);
//         System.out.println(2);
//         Thread.sleep(3000);
//         System.out.println(3);
//         System.out.println(4);
//     }
// }

//solved InterruptedException using throws keyword
// class ex12 {
//     public static void main(String[] args) throws InterruptedException {
//         System.out.println(1);
//         System.out.println(2);
//         Thread.sleep(3000);
//         System.out.println(3);
//         System.out.println(4);
//     }
// }


// /*Exception in thread "main" java.lang.NegativeArraySizeException: -1
// at A.main(...)*/
// class A {
//     public static void main(String[] args) {
//         int a[] = new int[-1];
//     }
// }

