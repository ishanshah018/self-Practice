class A
{
   void m1()
   {
    m2();
   }
   void m2()
   {
    m3();
   }
   void m3()
   {
    System.out.println(10/0);
   }
}
class Main
{
    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }
}

/* Exception in thread "main" java.lang.ArithmeticException: / by zero
        at A.m3(ex13.java:13)
        at A.m2(ex13.java:9)
        at A.m1(ex13.java:5)
        at Main.main(ex13.java:20) */
